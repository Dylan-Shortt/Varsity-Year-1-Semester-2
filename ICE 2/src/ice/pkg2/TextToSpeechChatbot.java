package ice.pkg2;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeechChatbot {

    public static void main(String[] args) {
    }

        public static void Voices(){
    System.setProperty("freetts.voices",
                "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory," +
                "com.sun.speech.freetts.en.us.cmu_time_awb.AlanVoiceDirectory");

        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice[] voices = voiceManager.getVoices();

        System.out.println("Available voices:");
        for (Voice v : voices) {
            System.out.println(v.getName());
        }
    }
    

    public static void textToSpeech(String text) {
    System.setProperty("freetts.voices",
            "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory," +
            "com.sun.speech.freetts.en.us.cmu_time_awb.AlanVoiceDirectory");
    
    //Fetching the voice to be used from the TTS engine
    VoiceManager voiceManager = VoiceManager.getInstance();
    Voice voice = voiceManager.getVoice("kevin16");

    if (voice != null) {
        voice.allocate();
        
        // Set parameters to approximate TTS
        voice.setRate(175);  // Moderate to fast speech rate
        voice.setPitch(120); // Neutral pitch
        voice.setVolume(2);  // Medium volume
        
        voice.speak(text);
        voice.deallocate();
    } else {
        System.err.println("Voice not found.");
    }
}

}