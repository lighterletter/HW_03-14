package nyc.c4q.lighterletter;

/**
 * John Gomez AC 2.1 C4Q 2015
 * Hw assignment, Adventure game 03-08-2015
 * "Awake" is a typical choose your own adventure game where the player wakes
 * up unaware of their surroundings and traverses a series of prompts while
 * navigating a story inspired by the spirit of some of the first interactive games.
 *
 * --You are an astronaut who wakes up in a desolate space station near earth,
 * your quest is to uncover what happened.
 */

import java.util.Scanner;

public class Awake {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//initializes the scanner

        //The following strings follow after a death
        String inputDeath = " **I failed to recognize your input.**";
        String death = "--You have succumbed to the timeless void.-- :(";
        String gameOver = "Game Over!.";
        String switchDeath = "Yo failed";

        System.out.println("Welcome to Awake, Type your realest dream and press Enter.");
        String userResponse = input.nextLine();

        for (int lives = 5; lives > 0; lives--) {

            while (lives <= 5) {


                while (lives >= 1) {

                    System.out.println("\n" +
                            "III???????????????++++++++++++++++++++++++++++++++========+++++++++++???????????????IIIIIIIIIIIII777\n" +
                            "IIII????????????????+++++++++++++++++++++++++++=:......,====++++++++++++??????????????IIIIIIIIIIIIII\n" +
                            "IIII????????????????+++++??+++++++++++++++++=,.............====+++++++++++???????????IIIIIIIIIIIIIII\n" +
                            "IIII?????????????????++++++?++++++++++++++=~...,,,,:::,,,....=====++++++++++??????????IIIIIIIIIIIIII\n" +
                            "III???????????????????+++??+++++++++++++=~:.,:~~~=======~~,...~======+++++++++?????????IIIIIIIIIIIII\n" +
                            "IIII?????????????????????++++++++++++++=~:,~=++??IIIIIIII?+=::,~========+++++++????????IIIIIIIIIIIII\n" +
                            "III??????????????????????+++++++++++++=~~:~II777$$$ZZZZZ$$$77I=,~~========++++++?????????IIIIIIIIIII\n" +
                            "IIII????????????????????++++++++++++++=~,~7$$ZOZ$Z$$$$$Z8888$$=+~~=~~======++++++????????IIIIIIIIIII\n" +
                            "III?????????????????????+++++++++++++==.:=8ZI???+????+:.+I7$ZD$=,~=~~~======++++++????????IIIIIIIIII\n" +
                            "IIII?????????????????++++++++++++++===~.~D$I++++????I?~.=???$8NI?....=~~=====++++++?????????IIIIIIII\n" +
                            "III???????????????????++++++++++++=...~.?MO$I?I77777777II??I$DM8ODO$?=~~======+++++++?????????IIIIII\n" +
                            "IIII?????????????????++++++++++++==?88D,8NNOZ$$ZZZZZZ$Z$$$7$8MND$ND8+=~~~=======++++++??????????II??\n" +
                            "IIII??????????????++++++++++++++===IDDD78DM8OZZZ888OOOOZ$$$ZDM8D.MDO?.~~~~=======++++++?????????????\n" +
                            "IIII?????????????++++++++++++++==:,7DDNN7OMONMMMMMMNNNNNMMNNDM8ZMMD$+,~~~~~=======++++++????????????\n" +
                            "IIII???????????+++++++++++++++==~:II88DNN$$ZOMMMMMMMMMMMMMD8MMINND87++~~~~~~=======+++++++??????????\n" +
                            "II????????????++++++++++++++=====??IOO88++DM8O8NNMNNNNNN8N888$Z?88O?==~~~~~~~=======+++++++?????????\n" +
                            "I???????????++++++++++++++=======+?+7Z::,?$$ZNDD$?I$$I?+ZDDDZ+=I~~7+~~~~~~~~~~=======++++++++???????\n" +
                            "II????????+++++++++++++=========~~~=+,.~+7ZZ88DMMMNNMMMMMMDZ8$=+=~,,~~~~~~~~~~~========++++++++?????\n" +
                            "I???????++++++++++++==========~~~~:..,,::87$$OO88DMMMMNND8D8$$Z+I?~,,,~~~~~~~~~~========++++++++++??\n" +
                            "I??????++++++++++===========~~~~~~=?I7$ZZZDN87$88DNMMMMNDDDDDDOZ7=?+:+:~~~~~~~~~=========++++++++++?\n" +
                            "I????++++++++=============~=~~~~~~:::~ZOZ$8O8DDDNNDDDDDDNNDD8OO$$7?+++=~~~~~~~~~==========++++++++++\n" +
                            "????++++++++=============~~~~~~::~::~$7OD8DDOO$ZZ$Z$$$$$IIDDNNOO$8O$IOZ+~~~~~~~~~~========++++++++++\n" +
                            "????+++++============~~~~~~~~~~+=+?IZOZONMMND~:~=+III$$$I?$DDDNDD8OZZZ:=+~~~~~~~~~~========+++++++++\n" +
                            "????+++++=========~~~~~~~~~~~??::~=~+ZONMMMNDZ8888NNND88D8DNNNNDD88OO88?+~~~~~~~~~~~=========+++++++\n" +
                            "??+++++=========~~~~~~~~~~~~+~=?++:,$OO8MMMNN88888NNND8888NNNNMNNNDDDOI?8~~~~~~~~~~~===========+++++\n" +
                            "?I7I?++=======~~~~~~~~~~~~~7+++?=O:+Z8D8OMMNNN8888NNDDDD8DNNNNOOOZZODZDO?=~~~~~~~~~~~==========+++++\n" +
                            "$$$$77+++====~~~~~~~~~~~~~~~$8O+?7+~7DD7IZDND88DDDDND8888NDNN8MMDN8NDNNO?=~~~~~~~~~~~~===========+++\n" +
                            "$$$$77+++===~~~~~~~~~~~~~~~=$=+=I8NDNMMD?~+DMDMMNNNNNNDNNMMNDNNMDNNNNNNON,:~~~~~~~~~~~=========+7777\n" +
                            "$$$777++++=~~~~~~~~~~~~~~~~IO?,IO8MMMMMNDDDN8MMMMMNNNMMMMMM8NDDNDDNNDOND8$=~~~~~~~~~~~========??7777\n" +
                            "$$$$77?==+~=~~~~~~~~~~~~~~~~7+$8NNMMNMMN$DZ?NNMMMMDDNNMNNNNDIZ7MODDNNNNDD7,=~~~~~~~~~=======+++I7777\n" +
                            "$$$777IIII==~~~~~~~~~~~~~~~~=:~7MDDNNNN7MZ$NNNMMMMNMMNNNMMZNNO8MN8NNNNDD8I,=~~~~~~~~~==+??++++I77777\n" +
                            "$$$7777III===~~~~~~~~~~~~~~~~~=$NDNNMMNNZNNDNMMMNDDNNDDDMMONMDONNM8DNNN8I+7~~~~~~~~~~==???+IIII7777$\n" +
                            "$$$7777IIII=====~~~~~~~~~~~~==~=?I+=~NMZDZON7NNNNNNNNDNDNNDDDM8?MN$DNN88$OD=~~~~~===~=????IIIII7777$\n" +
                            "$$$777777IIIII??~~~~~~~~~~~~==~=~~~~:O?N77OZMNDDDDDDDDD888N88$I$Z8$DDDDD$$,,~~~~~====??IIIIIII7777$$\n" +
                            "$$$777777IIIIII??~~~~~~~~~~~~~~==~==:7DDZD7MNNM88DDDDDDMM8NDZ$IZDD=$DNDNOZ8~=======+??IIIIII777777$$\n" +
                            "$$$7777777IIIII??=+=====~~==~~===+~88DN8$OMDNMMMMNNNNNDMDNDN87=8NN+?ODDND8?,==+?????IIIII777777777$$\n" +
                            "$$$$777777IIIII????++=============$O:NN+NN8DNNDDDNNNDNDDDDDDM8I8DD=?ZDDDDI???????IIIIIIII777777777$$\n" +
                            "$$$$777777IIIIIIII???++=+???????==??:N+MDO8DDDDDDDDDDN8DDDD8DDD7OO:77DDDZZ~~~+IIIIIIIIII7777777777$$\n" +
                            "$$$$77777777IIIIIIIII??=????????????~MMOZO$$ODDD8NNNDDDND8DD8OOZ7=+=ZOD8ZZ7==??IIIIIIIIII777777777$$\n" +
                            "$$$$$777777IIIIIIIIIIIIIIIIII?I?????NNDI$ZOOOZO8DDNNN8ND8O8Z$OZ$Z$=+$7D8OZ$+I?IIIIIIIII77777777$$$$$\n" +
                            "$$$$777777IIIIIIIIIIIIIIIIIIIIIIIII??ZO7OD8OZZON8DNNDDDDZNNDDO?Z~7++?IDD8Z$I$??????IIIIIIII77777777$\n" +
                            "Z$$$$7777IIIIIIII777777I77IIIIIIII??=8+II$$ONNNNNNDNDDDDNOO$$$$+:++++IDDD8777????IIIIIIIIIII77777777\n" +
                            "                                                                                     ");

                    System.out.println("  ________  ___       __   ________  ___  __    _______      \n" +
                            "|\\   __  \\|\\  \\     |\\  \\|\\   __  \\|\\  \\|\\  \\ |\\  ___ \\     \n" +
                            "\\ \\  \\|\\  \\ \\  \\    \\ \\  \\ \\  \\|\\  \\ \\  \\/  /|\\ \\   __/|    \n" +
                            " \\ \\   __  \\ \\  \\  __\\ \\  \\ \\   __  \\ \\   ___  \\ \\  \\_|/__  \n" +
                            "  \\ \\  \\ \\  \\ \\  \\|\\__\\_\\  \\ \\  \\ \\  \\ \\  \\\\ \\  \\ \\  \\_|\\ \\ \n" +
                            "   \\ \\__\\ \\__\\ \\____________\\ \\__\\ \\__\\ \\__\\\\ \\__\\ \\_______\\\n" +
                            "    \\|__|\\|__|\\|____________|\\|__|\\|__|\\|__| \\|__|\\|_______|\n" +
                            "                                                            \n" +
                            "                                                            \n" +
                            "                                                            " +
                            "                                                ");


                    //Beginning of game,
                    if (lives < 5) {
                        System.out.println(death + "\n"
                                + "(Next time check your input :])");
                        System.out.println("Lives left: " + lives +"\n");
                        userResponse = input.nextLine();

                    }

                    System.out.println("(You begin to hear the sound of machines softly humming around you, You open your eyes to see a small \n"
                            + "floating robot in front of you. It's friendly mechanical voice reaches out from the void.)\n"
                            + "- ... Hey... Hey!, wake up!\n"
                            + "(enter your name.)");//upon program start
                    userResponse = input.nextLine();


                    String userName = userResponse; //saves user input as variable: corresponding to what the program will refer to them as

                    System.out.println(userName + "! " + "God, I wasn't sure you'd wake up... Do.. Do you remember What happened? Who you became? \n"
                            + " (yes) " + " (no) ");
                    userResponse = input.next();

                    //1st argument, 'Yes' branch
                    if (userResponse.equalsIgnoreCase("y") || (userResponse.equalsIgnoreCase("yes"))) {

                        System.out.println(" Good, I'm glad you got through, I was afraid you might not make it. Hurry, follow me. \n" +
                                "'Okay'");

                        userResponse = input.next();
                        if (userResponse.equalsIgnoreCase("okay") || userResponse.equalsIgnoreCase("sure")) {

                            System.out.println("While you were Gone, I re-calibrated the engine. You should have a good chance at \n"
                                    + " making the connection. But remember, the wormhole will close soon and you're the last one left. \n"
                                    + " You may still have time, we need to get to that containment field! \n"
                                    + "'follow'");
                            userResponse = input.next();
                        }
                        if (userResponse.equalsIgnoreCase("follow")) {

                            System.out.println("(While running along the corridor behind Akos, you pass by \n"
                                    + "that same large window you've seen a million times, giving way to that giant floating \n"
                                    + "sphere outside glowing defiantly against the blackness of that infinite void. \n"
                                    + "a permeating statement to the humanity beneath your feet. It has always seemed slightly\n"
                                    + "spiritual. Your home planet. Earth.)\n"
                                    + "\n"
                                    + "-- He's not completely gone yet, " + userName + ". The other AIs and I are doing our best to keep \n"
                                    + "    the network suspended. Hopefully you'll reach him in time. However, We wont last long with that \n"
                                    + "    monster out there. His gravitational waves are increasingly destabilizing.\n"
                                    + "\n"
                                    + "   (1) 'Thanks Akos... I knew you wouldn't forget about me'");
                            userResponse = input.next();
                        }
                        if (userResponse.equalsIgnoreCase("1")) {

                            System.out.println("(You reach the end of the hall and enter a giant room that houses a monster. \n"
                                    + " a blackness blacker than anything you've ever seen. A black hole contained in a stasis field \n"
                                    + " that's quickly falling apart. Akos guides you to the terminal, there the computer asks you to \n"
                                    + " Identify yourself. After the eye and fingerprint scan it asks you a single question. A message \n"
                                    + " from yourself. A dream from a life long past, it simply states..)\n"
                                    + "                                        --'Why?'--");
                            userResponse = input.next();
                            System.out.println(
                                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNDD88O$77II?III77$ZZO88DDNNNNMMMMMMMMMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMMMMMMMMNMMNMDDNND8OZ$7I?+=====++?II7$ZZ8DNNNNMMNMNMMMMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMMMMMMMMMNNNDN88OO$I?+=~::,,,,::~==+?7$ZOOO8DNNNNMMMMMMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMMMMMMMMMNDDD8OZZ7?+~:,.........,,:=+?7$ZZO888DNNMMMMMMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMMMMMMMMMND88OZ$I?~,...          .,:~+?II$ZO88DDDNNMMMMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMMMMMMMMNND8OO7I+~,.              .,:==+I7$$OO88DNNMMMMMNMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMMMMMMNNNN88O$I?=,..              ..,:=+?I7$ZZO88DNMMMMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMMMMMMMNNN8O$$+=:.                 ..:~~+?I7Z$O8DDDNMMMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMMMMMMMMND8OZ7+~,.                  .,:=+?I77ZZ8DDNMMMMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMMMMMMMMNDOZ$I+:.                  ..,:~=+II$ZODNNNMMMMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMMMMMMNNNDO$7?=:.                    .:~~+I7$O8DNNNNMMMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMMMMMMMNN8O$I=:,.      . ,:,.        .,:=?7$$O88DNNNNMMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMMMMMNMNDOO$I?:.       . ~+,       . .,~=?7$ZZZZ8DDNNMMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMNMMNDDD8ZZ7I?~,       ..??,         .,~=++?I7$$$8DNNNMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMMMMDDD8Z7?=~~:,..    .=I$$I~.       .,:~=++?I7$ZO8DNNMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMNNN88O$7+=:,..       ,IZOOO7~      ..,:~==+?I7$ZO8DNNMMMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMNNNDOZ7I=::,...      ~+ZO8O$+.   ....,:~=++?I77$ZO88DNNMMNMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMNNND88ZI+~:,,...  .  ==O88DZ+.  .....,:~+?I7$ZZOO8DDDNNMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMNNDD888OO$I+=~::,...   .?+8DD8O$=......,::~++??7$ZO8DDDNNNMMMMMMMMMM\n" +
                                            "MMMMMMMMMMMMMMMDND88O$7?=~::,.......++Z88OI~.. ....,:~=+?II7$ZO8DDDDNNMMMMMMMMMM\n" +
                                            "MMMMMMMMMNNNDDDDD88OO$7?++=::,...   ~+77$$I:.......,:~=?I77$ZZ888DDNNNNNMMMMMMMM\n" +
                                            "MMMMMMNNNNNNNDNDD88OZ$$7?+=~::.......:I?=$+........::~=+I7$ZZO88DDDDDNMMMMMMMMMM\n" +
                                            "MMMNMMMNNNMMNDDDDDD8OZ$7?+++~:,..... .?+.$~.......,:~=+?II$ZOO88DDDNNNNMMMMMMMMM\n" +
                                            "NMMMMMMMMNNMNNNDND888O$7III?~:,.......?=.$~......,,:~+II7$$OO8DDDDDDNNNMMMMMMMMM\n" +
                                            "MMMMMMMMMNNNNNNDNDN8OZ$$777+=~,.......+~.7:......,,:=+I7$ZZOOO8DDNDDNNNNNMMMMMMM\n" +
                                            "MMMMMMMMNNNNNNNNNNDOOZZ$Z7I++:,,......=~.I~......,:~=?I7$ZO8888DDDDNNNNMNMMMMMMM\n" +
                                            "MMMMMNNMMNNNMMNNN8OOOZZZ77II+=~:::::::~~:I=:::::::~++?I7$$ZOOOO88O888DDDDDDDDDDD\n" +
                                            "MMNNNNNNNNMMNMNND888OZ$$777I?++======~===I+========+?II7$$$$ZZZZZZZOOOOOOOOOOOO8\n" +
                                            "NNMNNNMMMNNMMMNDD8888Z$..7.,...:= ..~,.,~?,.=~,,.===+?I77$$ZZZZOZOZOOOOOOOOOOOOO\n" +
                                            "NNNMMMMNMMNMMDDDD8888Z$+777I.?.= =..==..~=+=:=~=====++I77$$ZZZZOOZOOOOOOOOOOOO8O\n" +
                                            "MMMMMMMMMMDDNNNDDD88Z$$.,$77I?+=.=======~?..=========++I77$ZZZZZOOOOOOOOOOOOOOOO\n" +
                                            "MMMMMMNMMMNDNNDDDDD8OZZ:+=+I:===~,,,=====+===========+++I7$$$ZZZOOOOOOOOOOOOOOOO\n" +
                                            "MMMNMMNNDMDNDNNDDD8OOZZZ$$$7I++==========++===========++?I$$$ZOOOOOOOOOOOOOOOOOO\n" +
                                            "MMMMMMNMNMMNNNDDD8888DDOZOO$I::,......,::~~.........,,,:=+7ZOOODNNNMNMNMMMMMMMMM\n" +
                                            "NNNNMMMNNMMMMNMNMM87I?+==++?I$ZO8DDMMMMMMMMMMMNOZ$777III??????III7777$$ZOO8NNMMM");
                            System.out.println("(You remember. Why you tried, why you felt. You input that one key word, the one that\n"
                                    + "Lets the system know why humanity must stay.\n" +
                                    "\n"
                                    + "                                           -Love-\n" +
                                    "\n"
                                    + "The containment field absorbs the singularity, a portal opens and you see yourself from\n"
                                    + "long long ago, as the person you once were, and who you longed to be. Fulfilment \n"
                                    + "fills your lungs as you realize that your future can be even brighter. Akos and the \n"
                                    + "other AIs will rebuild the rest of humanity out of your genes, You become the mythological creator \n"
                                    + "The adam/eve of a whole new generation of humanity, the traces of civilization you left will be \n"
                                    + "priceless gifts for all the generations to come. Humanity will finally be...");
                            System.out.println("  ________  ___       __   ________  ___  __    _______      \n" +
                                    "|\\   __  \\|\\  \\     |\\  \\|\\   __  \\|\\  \\|\\  \\ |\\  ___ \\     \n" +
                                    "\\ \\  \\|\\  \\ \\  \\    \\ \\  \\ \\  \\|\\  \\ \\  \\/  /|\\ \\   __/|    \n" +
                                    " \\ \\   __  \\ \\  \\  __\\ \\  \\ \\   __  \\ \\   ___  \\ \\  \\_|/__  \n" +
                                    "  \\ \\  \\ \\  \\ \\  \\|\\__\\_\\  \\ \\  \\ \\  \\ \\  \\\\ \\  \\ \\  \\_|\\ \\ \n" +
                                    "   \\ \\__\\ \\__\\ \\____________\\ \\__\\ \\__\\ \\__\\\\ \\__\\ \\_______\\\n" +
                                    "    \\|__|\\|__|\\|____________|\\|__|\\|__|\\|__| \\|__|\\|_______|\n" +
                                    "                                                            \n" +
                                    "                                                            \n" +
                                    "                                                            " +
                                    "                                                ");
                            System.out.println("Thank you for playing.");
                            System.out.println("THE END.");


                            return; //1st ending.

                        //death system
                        } else if (!userResponse.equalsIgnoreCase("follow")) {

                            System.out.println(inputDeath + " \n"
                                    + "--you broke the connection!--\n"
                                    + " lives left: " + (lives - 1));
                            System.out.println( " Retry? (yes) or (no)\n");

                            userResponse = input.next();
                        }
                        if (userResponse.equalsIgnoreCase("yes") || (userResponse.equalsIgnoreCase("y"))) {
                            lives = lives - 1;

                        } else if (lives == 0 || (!userResponse.equalsIgnoreCase("yes"))) {
                            System.out.println(gameOver + death);
                            return;
                        }


                    }
                    //1st argument, 'no' branch.
                    if (userResponse.equalsIgnoreCase("n") || (userResponse.equalsIgnoreCase("no"))) {

                        System.out.println(
                                "My name is Akos, I am the last remaining AI in this facility. You have been asleep for 3,576 earth \n"
                                        + "years 46 days and 38 seconds. As far as my databases go, you are the last remaining biological entity \n"
                                        + "in the space station, most of my systems have withered except for critical functions. I'll explain \n"
                                        + "as we go, but We don't have much time, Hurry!\n"
                                        + "(follow)");
                        userResponse = input.next();
                        if (userResponse.equalsIgnoreCase("follow")) {

                            System.out.println("(Leaving a medical room you find yourself running along a corridor behind this small floating object,\n"
                                    + " you pass by a large window, outside you see a giant planet suspended in space. It seems vaguely familiar.\n"
                                    + "A second later you recognize it as you home. Planet Earth.)\n"
                                    + "\n"
                                    + "-- You're an astronaut, " + userName + ". The last clone of this space station's original commander, your mission \n"
                                    + "was to research zero point energy as a viable resource for humanity's coalition. \n"
                                    + "There was an accident and the containment field for the stabilized black hole you created failed.\n"
                                    + "\n"
                                    + "Your memory will return, in the meantime, what you need to know is that the containment field is at \n"
                                    + "the end of this hall. Once we reach it you must manually initialize the abort sequence.  \n"
                                    + "Your predecessors couldn't make it on time and they all fell into the anomaly, who knows where they are.\n"
                                    + " In any case, my calculations in behavior variants give you a 51% chance of success for your final attempt. \n"
                                    + "(1) - I'll make it. (2) - say nothing");
                            userResponse = input.next();


                            if (userResponse.equalsIgnoreCase("1")) {
                                System.out.println("The experiment has outlived your species, if you don't stop it, the other AIs and I might not be able to \n"
                                        + "synthesize your genes and revive your kind. You're your own last chance.\n"
                                        + "The experiment is ran by a biometric fail-safe system, so we can't stop it without human input.. \n"
                                        + "\n"
                                        + ".. We're getting closer, but it's gravitational waves are increasingly destabilizing, I don't know \n"
                                        + "if we'll make it, but you must initialize the fail-safe sequence, if you don't you and your species' \n"
                                        + "history will be gone!\n"
                                        + "'initialize'");
                                userResponse = input.next();
                            } else if (userResponse.equalsIgnoreCase("2")) {
                                System.out.println("..We're about to meet the confluence limit, make sure that as soon as we do, you initialize the sequence!\n"
                                        + "'initialize'");
                                userResponse = input.next();
                            } if (userResponse.equalsIgnoreCase("initialize")) {
                                System.out.println(" (You reach the end of the hall and enter a giant room that houses a monster. \n"
                                        + " a blackness blacker than anything you've ever seen. A black hole contained in a stasis field \n"
                                        + " that's quickly falling apart. Akos guides you to the terminal, there the computer asks you to \n"
                                        + " Identify yourself. After the eye and fingerprint scan it asks you a single question. A message \n"
                                        + " from yourself. A dream from a life long past, it simply states..\n)"
                                        + "                                 --'Why?'--");
                                userResponse = input.next();
                                System.out.println("+=~:,?ZZO8NMMMMMMMMMN8MMNMMMMMDDN:NNMO8NMONMI7,........,,:,,~:?=:~,++ZI=~:ZDNNMN\n" +
                                        "~~::.?I7ODNMDMMMMMMMMNMNMMMMNNMMMMMZMMMMDM$.........,,:..,,~,:+~,=?IO?DZ$I:~NMMZ\n" +
                                        "~::,.?I7OZDDDMDMMMMMMMMMMMNMMMMNMMMMNMMMMM,......,.:,...,~:=~I=?I$Z7M$MNN8O~~ONM\n" +
                                        "::,,:I$7Z87$8MMMMMMM8NMMMMMMM8MMOMNMMMMMN,........,,,..,::7Z7I7888DMMMMMMMMN=,NM\n" +
                                        ",,..??ZODDI88NMMMMNMNNMNDMMM+=?+DZMNNNMN$.......,..::I7:~:~OI7ZNDNMMMMMMMMMMMO+D\n" +
                                        ",,.,I7ZONNMM8MMMMMMMMMMNMO,7+IMMMN=MOMNN,....,:,,=:=$O~~::~?ZO8DDZNMMMMMMMMMMMN=\n" +
                                        ",.,I$OOD8M8MMM~MNMMMMMMM.~.:ZNNMMMM8NND7....,,::,=?7=,~?I?$$O8OONZN7=7IMMMMMMMM8\n" +
                                        ",.?7+OZN8MMNM:MMMMMMNMMM.,+?78MMMMMMZ88:....,:::==+?+?78O$$OOD8DMM,?$MMMMMMMMMMO\n" +
                                        ".+I$88NMMMMNMMNMNMMMMMM$=?MMMMNMMMMM,$.,...,,,::~~~=++78MMMD78NNND:8MMMMMMMMMMD8\n" +
                                        "?77Z8DNNMMNMMMMMMMMMMMMM,ONMMM88MMN?.,:,...,,,.,:~==I8DDNNND$$88DNM=7NMMMMMMMM?N\n" +
                                        "77O8NNNMMMMMMNMMMMMMMMMM.+?DNIMZZ=7,.,:........,:~+7$O8$7O8O7+I8NMMMMMMMMMMMMM8Z\n" +
                                        "$$8ONDNMMMMMMMMMMMMMMMMMM?~7O=?+::.7.,:,.......,:=I$7+=ZI?7$7$ONMMMMMMMN88MMMMD$\n" +
                                        "Z7DONMNNMDNZMMMMMOMMNMM88NMM:~::OD$+,.,,......,,:~=~=++??+=IODDDNMMNNNMMMMMMMM?~\n" +
                                        "DNNDN$MNMN8MD8MDMMMMINNMNNDD888Z8O7=..,......,,,,,:~~:~~+???8ONOZ8DNNMMMMMMMMN+~\n" +
                                        "DNNNMNMNNZZMMMMNDNMMMMNMMNDNDD88DZI=:..,.....,...,,,:,:=?$$I?$$O$$NMMMMMMMMM8I~:\n" +
                                        "ONOMNNNN$NNMNNMNMMMNNOM$MMNOD88ZO$I=~,.,,.......,,,,,,~???II?=~$OONMMMMMMMMN?+:7\n" +
                                        "MDNNNNNDDDN8NNNNNMMMMMMNMMNNDDD8Z$??:,........,,,,,,,,:=+=?~~~=+7O8MMNMNMMO++,?M\n" +
                                        "DMN8MNN8NN7DNDDNNNNMNDNMNMMD8D8OZ$I?:..........,,,,,,,::~~:::?7=?D7ZMMNDM87=,=N8\n" +
                                        "MMNNMMNMNN8NNDNDNNDN$DDNMNNND88$7II~............,,,.,.,,:~:~Z$:?IZ$IDDOO$=,,7MMM\n" +
                                        "MMMMNMMMNDDNNNOZ8ODD8DDDNMOND8O77?:..............,.,,,,,::==?:,,::+?+7?~,,:DMMMM\n" +
                                        "MMMMMMMNNNNDD8O$II+IODDDNNNN8OZ7+,...................,,,..,:,,...~::::,.,$MDMMMM\n" +
                                        "MMMMMMMMMNND8O7=~,:==?Z8NDDDD$=,....,:+++=....,,,.....,,,,,:,,,.......~ZNNDNMNMM\n" +
                                        "NMDMNMMMNNNN8D$?~,,,,~+ZZDN8Z~,..::???77II7~..:,::I+......,,.......:,+NDNNNNNNNN\n" +
                                        "MMMMDNNMDDNDDZZI=,:::::~~ZZ+,..,~,7I$~O78ZOO7=...:?ZO8O+,,,..,,.+=,..$NMDNDD8ZMM\n" +
                                        "MMMMMMMNMMDOD$I7::,:+?=:::...:+$$ZZ?788DD$O8O88?,.$DND8DNN8DD7~DMM8ZNMN8MDNNDODM\n" +
                                        "MZMMMMMMMNN8D$$?+~,,~OD+,...=O8N8888DND8DDDDDNNNNNNZNNNNNNNDNMNDIZMMMDMM8:NNNNNN\n" +
                                        "M7MMMNNMMMNND87+?+=,,~??=::+$O8NNDNNNNNZNNMDNNNNMMMMNNM7NMNNMMMMNMDMNNN8NN8NDNNN\n" +
                                        "MMMMMMMMNNDD8$7II7?~,,~ONN=:=7DNMNMNNNMMNNNNDNMN8NNMMMMMMMMMMMMMMNNNMNNMNNOMMNNM\n" +
                                        "MMMMNMMMNNDDZ7ZZ$ZII+:,:7O?::=ZDNNMNNNMNMDNMMMNMM8N~MNMNZNDMMMMMDMNDMMNDMMMNNNMM\n" +
                                        "MMMMMMMMNMNO88Z$OOZOI?~::~~:,~7OZDNNNMNMNNMMMMMMNM?DDNNNDNNNMDMNNMNNNMMMNMMMNZMZ\n" +
                                        "MMMMMMMMMDNDDDDODO8ZZ?+:::,,,~IZDDNNNNDNDNMNNMMMNNNMNNDMN8NONNNNNNNMMMMMNZNNNN8M\n" +
                                        "MMNZMMNNDNNNNDDDD8O$7?=~~,:::~?ODND$NN7DNMNMMMMMNNMMNNONMMNNNMMNDMMMMMMNNDNMNNNM\n" +
                                        "DNNMMNNMNMMNNNDDDOZ7?+=?II:=~=I8NNNDND8NMMM$MMMNDNMNNDNMMMMMMMMMNMNNMMMMDNNMNNMN\n" +
                                        "MMMZMMMMMNNNNDDDD8$?.+ZO88O$ZOZDDNNMMMMNMMMMMMMMNMNM8NNNMMMMMMDMMMMMMDMN8MNMMMNM\n" +
                                        "MMMMNMMMMMNNNNNNDO8$O8DDDDNNZNN8DNMMDMMMMMMMONNNMNMONDNDNN+MMMMMMMMMMMMNNMMMMNMM\n" +
                                        "MNMMMMMMMMMMMNNND$DN8NNNNMDNDMNMMNMMMM8MNMMMMMMMMMM8MNNMDNZMMMMMN88NZN8MNMMMMMMN\n" +
                                        "NMMMMNMMMMMMM8NNDNNNDNDDNMMMMMIMNMNMMMMMMMNMNM?MMMMMMNMMMMMMMMMN8?MMNZMNMMMNDMMM\n" +
                                        "NMNMDMNMMMMMMDDNMMNNM8MNMMNNMMN~M8NNONMMNMMNMMMMMMNDMNMNMMNMM8MMD8MNMMMMNMM8MMMN");
                                System.out.println("Suddenly, like a flash of lightning through your veins you remember\n"
                                        + "A dream from a long time ago. One that gave you hope, and what got you here in the\n"
                                        + "first place..\n"
                                        +"\n"
                                        + "                                  --Love--\n"
                                        + "\n"
                                        + "The singularity absorbs the containment field, a portal opens and you see yourself engulfed\n"
                                        + "in a distant past, as the person you once were, and who you longed to be. Nostalgia \n"
                                        + "fills your lungs as you remember that your future could have been brighter. The Earth\n"
                                        + "and everything around it descends into the unfathomable blackness of nonexistence. Akos and the \n"
                                        + "other AIs will not rebuild the rest of humanity out of your genes, You will become a fading legend \n"
                                        + "and your species will become a myth. Any far off traces of civilization left will be \n"
                                        + "priceless gifts for whichever species to come. However, in your last brief seconds you find peace in\n"
                                        + "understanding that through it all and in the very least humanity was once...");
                                System.out.println("  ________  ___       __   ________  ___  __    _______      \n" +
                                        "|\\   __  \\|\\  \\     |\\  \\|\\   __  \\|\\  \\|\\  \\ |\\  ___ \\     \n" +
                                        "\\ \\  \\|\\  \\ \\  \\    \\ \\  \\ \\  \\|\\  \\ \\  \\/  /|\\ \\   __/|    \n" +
                                        " \\ \\   __  \\ \\  \\  __\\ \\  \\ \\   __  \\ \\   ___  \\ \\  \\_|/__  \n" +
                                        "  \\ \\  \\ \\  \\ \\  \\|\\__\\_\\  \\ \\  \\ \\  \\ \\  \\\\ \\  \\ \\  \\_|\\ \\ \n" +
                                        "   \\ \\__\\ \\__\\ \\____________\\ \\__\\ \\__\\ \\__\\\\ \\__\\ \\_______\\\n" +
                                        "    \\|__|\\|__|\\|____________|\\|__|\\|__|\\|__| \\|__|\\|_______|\n" +
                                        "                                                            \n" +
                                        "                                                            \n" +
                                        "                                                            " +
                                        "                                                ");
                                System.out.println("Thank you for playing.");
                                System.out.println("THE END.");
                                return; //2nd ending
                            }

                        //in case of death
                        } else if (!userResponse.equalsIgnoreCase("follow")) {

                            System.out.println(inputDeath + "\n"
                                    + "--you broke the connection!--\n"
                                    + " lives left: " + (lives - 1));
                            System.out.println("Retry? (yes) or (no)\n");
                            userResponse = input.next();
                        }
                        if (userResponse.equalsIgnoreCase("yes") || (userResponse.equalsIgnoreCase("y"))) {
                            lives = lives - 1;

                        } else if (lives == 0 || (userResponse.equalsIgnoreCase("no"))) {
                            System.out.println(gameOver + death);
                            return;
                        }


                    }

                }//game over, when for loop runs out of lives.
                if (lives == 0) {
                    System.out.println(gameOver + death);
                    return;


                }
            }

        }

    }
}

























