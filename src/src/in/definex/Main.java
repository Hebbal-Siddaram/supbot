package in.definex;

public class Main {

    public static void main(String[] args) {


        //Creating the looper and sending code to create components and initializing it
        Looper looper = new Looper(


                new Looper.ExtraLooperFunctions() {
                    @Override
                    public void addThingsInBot() {
                        //add stuff in the bot here,

                        //Bot.getFeatureManager().add(new YourFeature(Parameters params));

                        //Bot.getChatProcessorManager.add(new YourChatProcessor(Parameters params));

                        //Bot.getChecker().add(new YourCheckers(Parameters params));

                        //Bot.getConsole.add(new YourConsoleCommand(Parameters params));

                        //Bot.getRemoteActionCall().add(YourAction.class);
                    }

                    @Override
                    public void moreInits() {
                        //initialize things here
                    }
                }

        );
        looper.setChromeProfileLoc("D:\\Extra\\ChromeProfile");
        //Run the code to initialize components and start the bot.
        //Bot Services can only be used after looper.start()
        looper.start();



        //Wait for the bot to quit.
        looper.join();
    }

}
