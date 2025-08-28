package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {

    public String reply(String message, ReplyType type) {
        // TODO: Implement mapping according to README canonical expectations.

        if (message == null || message.isEmpty() || message.strip().length() == 0) {
            return "Please say something.";
        }else {

                switch (message) {
                    case "hi":
                        switch (type) {
                            case FORMAL:return "Hello. How may I assist you today?";


                            case FRIENDLY:return "Hey there! \uD83D\uDE0A How can I help?";
                            case CONCISE:return "Hello. How can I help?";
                        }
                        break;

                    case "hello":
                        switch (type) {
                            case FORMAL:return "Hello. How may I assist you today?";
                            case FRIENDLY:return "Hi! \uD83D\uDC4B What’s up?";
                            case CONCISE:return "Hello. How can I help?";
                        }
                        break;

                    case "how are you":
                        switch (type) {
                            case FORMAL:return "I am functioning properly. How may I assist you?";
                            case FRIENDLY:return "Doing great! \uD83D\uDE04 How can I help?";
                            case CONCISE:return "I’m good. How can I help?";
                        }
                        break;


                    case "i need help":
                        switch (type) {
                            case FORMAL:return "I can assist with that. Please provide more details.";
                            case FRIENDLY:return "I’ve got you! \uD83D\uDE42 Tell me a bit more.";
                            case CONCISE:return "Share details; I’ll help.";
                        }
                        break;


                    case "can you help me with my account":
                        switch (type) {
                            case FORMAL:return "Certainly. Please describe the account issue.";
                            case FRIENDLY:return "Sure thing! 😊 What’s wrong with the account?";
                            case CONCISE:return "Describe the account issue…";
                        }
                        break;

                    case "thanks":
                        switch (type) {
                            case FORMAL:return "You are welcome.";
                            case FRIENDLY:return "Anytime! \uD83D\uDE4C";
                            case CONCISE:return "You’re welcome.";
                        }
                        break;

                    case "bye" :
                        switch (type) {
                            case FORMAL:return "Goodbye.";
                            case FRIENDLY:return "See you later! \uD83D\uDC4B";
                            case CONCISE:return "Goodbye.";
                        }
                        break;

                    case "what is your name":
                        switch (type) {
                            case FORMAL:return "I am your virtual assistant.";
                            case FRIENDLY:return "I’m your helper bot \uD83E\uDD16";
                            case CONCISE:return "I’m your assistant.";
                        }
                        break;

                    default:
                        switch (type) {
                            case FORMAL:return "Could you clarify your request?";
                            case FRIENDLY:return "Could you tell me more?";
                            case CONCISE:return "Please clarify.";
                        }

            }
        }
            // Requirements:
            // - null or blank -> "Please say something."
            // - For known messages, return exact string for each ReplyType.
            // - For unknown messages, return the 'any other text' mapping.
            // throw new UnsupportedOperationException("Not implemented yet");
            return "Please say something.";



    }
}
