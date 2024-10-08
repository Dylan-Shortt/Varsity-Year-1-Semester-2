package currencyconvertortest;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyConvertorTest implements ActionListener {


    //  API key
    final String API_ENDPOINT = "https://v6.exchangerate-api.com/v6/b1f1a424e49ea438080cf652/latest/USD";//b1f1a424e49ea438080cf652
    static String[] CURRENCIES = {
            "USD", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG",
            "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB",
            "BRL", "BSD", "BTN", "BWP", "BYN", "BZD", "CAD", "CDF", "CHF", "CLP",
            "CNY", "COP", "CRC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD",
            "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "FOK", "GBP", "GEL", "GGP",
            "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG",
            "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD",
            "JOD", "JPY", "KES", "KGS", "KHR", "KID", "KMF", "KRW", "KWD", "KYD",
            "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA",
            "MKD", "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK", "MXN", "MYR",
            "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN",
            "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF",
            "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD",
            "SSP", "STN", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY",
            "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "UYU", "UZS", "VEF", "VND",
            "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW",
            "ZWL"
    };

    static JFrame f;
    static JLabel amountLabel;
    static JLabel fromLabel;
    static JLabel toLabel;
    static JLabel resultLabel;
    static JComboBox<String> fromCurrencyBox;
    static JComboBox<String> toCurrencyBox;
    static JTextField AmountField;
    static JPanel p;

    public static void main(String[] args) {
        f = new JFrame("CURENCIO");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 350);
        f.setLayout(null);
        f.setLocationRelativeTo(null);

        amountLabel = new JLabel("Amount");
        amountLabel.setFont(new Font("Arial", Font.BOLD, 16));
        amountLabel.setBounds(15, 10, 100, 34);

        AmountField = new JTextField("1");
        AmountField.setBounds(10, 40, 180, 34);

        fromLabel = new JLabel("From");
        fromLabel.setFont(new Font("Arial", Font.BOLD, 16));
        fromLabel.setBounds(15, 70, 80, 34);

        toLabel = new JLabel("To");
        toLabel.setFont(new Font("Arial", Font.BOLD, 16));
        toLabel.setBounds(15, 130, 80, 34);

        fromCurrencyBox = new JComboBox<>(CURRENCIES);
        fromCurrencyBox.setBounds(5, 105, 200, 25);

        toCurrencyBox = new JComboBox<>(CURRENCIES);
        toCurrencyBox.setBounds(5, 165, 200, 25);

        resultLabel = new JLabel();

        p = new JPanel();
        p.setLocation(300, 150);

        JButton converterButton = new JButton("Convert");
        converterButton.setFont(new Font("Arial", Font.BOLD, 16));
        converterButton.setBackground(Color.RED);
        converterButton.setBounds(10, 220, 280, 40);
        f.add(amountLabel);
        f.add(AmountField);
        f.add(fromLabel);
        f.add(toLabel);
        f.add(fromCurrencyBox);
        f.add(toCurrencyBox);
        f.add(converterButton);
        converterButton.addActionListener(new CurrencyConvertorTest());
        f.add(p);
        f.setVisible(true);
        
    }

    @SuppressWarnings("deprecation")
    public double convert(double amount, String fromCurrency, String toCurrency) throws IOException {
        // Make Request
        URL url = new URL(API_ENDPOINT);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader(request.getInputStream()));
        JsonObject jsonobj = root.getAsJsonObject();

        // Accessing object
        JsonObject conversionRates = jsonobj.getAsJsonObject("conversion_rates");

        // Ensure that the currencies exist in the conversion_rates object
        if (!conversionRates.has(fromCurrency) || !conversionRates.has(toCurrency)) {
            throw new IllegalArgumentException("Invalid currency codes");
        }

        double rateFrom = conversionRates.get(fromCurrency).getAsDouble();
        double rateTo = conversionRates.get(toCurrency).getAsDouble();

        return amount * rateTo / rateFrom;
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Convert")) {
            double amount = Double.parseDouble(AmountField.getText());
            String fromCurrency = (String) fromCurrencyBox.getSelectedItem();
            String toCurrency = (String) toCurrencyBox.getSelectedItem();
            double result;
            try {
                result = convert(amount, fromCurrency, toCurrency);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            resultLabel.setText(String.format("%.2f %s = %.2f %s", amount, fromCurrency, result, toCurrency));
            resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
            resultLabel.setForeground(Color.BLACK);
            resultLabel.setBounds(45, 270, 280, 20);
            f.add(resultLabel);
            f.revalidate();
            f.repaint();
            TextToSpeech text = new TextToSpeech();
            text.textToSpeech("The amount: " + amount + "  is " + result);
        }
    }
}