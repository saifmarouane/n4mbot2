package com.n4mbot.service;

/**
 * MajBot 1.0
 *
 * @author Seyed Majid Khosravi
 */
public class Main {

    public Bot bot;

    // default constructor
    public Main(String file) {

        // construct a data parser
        DataParser dp = new DataParser(file);

        // construct new bot with level 0 as default and given data parser
        this.bot = new Bot("0", dp);

    }

    public String chatBot(Bot bot) {
        return bot.getMessage();
    }


    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public static String send(String send, Bot bot) {
        // TODO add your handling code here:

        String response = bot.send(send);

        // if the response is not empty display it
        if (response.length() > 0) {
            return response;
        }

        // clear the message textbo

        // display new state message
        return bot.getMessage();

    }

    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {
        Main main = new Main("data.xml");
        System.out.println(main.chatBot(main.bot));
        System.out.println(main.send("ayoub", main.bot));
        System.out.println(main.send("fine", main.bot));
        System.out.println(main.send("play footbal", main.bot));
        System.out.println(main.send("weather", main.bot));
        System.out.println(main.send("man", main.bot));
        System.out.println(main.send("yes", main.bot));
    }
}
