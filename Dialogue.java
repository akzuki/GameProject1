
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dialogue {

    private HashMap<Integer, List<ChoiceAction>> actionFirstNight = new HashMap<Integer, List<ChoiceAction>>();
    private HashMap<Integer, List<ChoiceAction>> actionFirstSeeNum_p1 = new HashMap<Integer, List<ChoiceAction>>();
    private HashMap<Integer, List<ChoiceAction>> actionFirstSeeNum_p2 = new HashMap<Integer, List<ChoiceAction>>();
    private HashMap<Integer, List<ChoiceAction>> actionREvent1 = new HashMap<Integer, List<ChoiceAction>>();
    private HashMap<Integer, List<ChoiceAction>> actionREvent2 = new HashMap<Integer, List<ChoiceAction>>();
    /////////////////////////////////// Option Commands + Location Commands

    private String generalOpts = "Please choose one action from below. \n \t (1). Move \n \t (2). Explore \n \t (3). Eat food \n \t (4). Study \n \t (5). Check inventory \n \t (6). Rest";
    private String exploreItems = "[If you want to take items, input a number in the brackets above. If not, just give some letters]\n\t\t\t-----\nWhich one do you want to take?";
    private String toHome = "\t (0) Home";
    private String toClassA = "\t (1) Your classroom";
    private String toClassB = "\t (2) Your buddy's classroom";
    private String toMountain = "\t (3) Mountain";
    private String toJanitor = "\t (4) Jani the Janitor's";
    private String toTeacher = "\t (5) Your chemisty teacher's";
    private String toTattoo = "\t (6) Tate the Tattooist's";
    private String toPolice = "\t (7) Police station";
    private String toRiver = "\t (8) River";

    /////////////////////////////////// Notices / Warnings / Statements

    private String endDay = "You're tired and decide to get a rest.\n\t# Stamina reverted to 100 #\nA new day has begun";
    private String notAccess = "CANNOT ACCESS THIS AREA!";
    private String stillFull = "You are still full! You shouldn't eat!";
    private String janitorNote = "I enjoyed the XXXXX days when we were worXXg together in that XXX.\nIt was just a magical substance, and XXXX.\nIt tXXd the daily XXX that we cannot live without into XXXhing so XXX.\nXXX promised that XXX the fate of us but the project got XXXXX due to XXX\n\t\t\t\t\t\t\t56.82.13 | Z \n\t\t\t\t\t\t\t165.168.11 | 3";

    /////////////////////////////////// First Night

    private String firstNightChoice0_a = "...\n\tYou slam yourself into the figure, but it just disperse ...\n\tAfter a few times, you find it nowhere to be seen ... It's gone!";
    private String firstNightChoice0_b = "...\n\tBut your Courage is sure to be needed in this journey!\n\t# Courage went up by 2 #";
    private String firstNightChoice1_a = "...\n\tYou take some time standing there and look at the figure ...\n\tIt jumps and shakes around you, but no real movement at all ... It is actually wandering away...!";
    private String firstNightChoice1_b = "\n\tYour Patience and Understanding of situation may be great in this journey\n\t# Understanding went up by 2 #";
    private String firstNightChoice2_a = "\n\tYou just run away, avoiding any further advancement of the figure...\n\tAfter all, nothing really happened...";

    private String[] firstNight = {
            "...!", //0
            ".........!",
            ".............!",
            ".............. DaRkNeSs!",
            "The pure color of despair and fear...! That very darkness is crawling and crawling the way onto your body ...!",
            "Is this a dream? If it is... then why are you feeling such cold ...? And pain, in your head..?",
            "VROOM!... A figure suddenly pops up in the midst of the shade, blacker than even the night itself.",
            "\t @ You decide to...? \n\t(0) Go through it \t (1) Stand there and observe \t (2) Run away", //7
    };

    /////////////////////////////////// First See Numbers p1

    private String firstSeeNumChoice0_a1 = "Rekt sees you with very confusing eyes. He thinks you haven't got yourself awake yet.";
    private String firstSeeNumChoice0_b1 = "You just prove your awkwardness within 5 seconds. Good fuqing job!\n\t# Abnormality went up by 2 #";
    private String firstSeeNumChoice1_a1 = "He laughs it off then proceeds to tell one of his humble dream where he slays Death himself.";
    private String firstSeeNumChoice1_b1 = "Seems like your story is not a big deal to your best dude at all, huh?";

    private String[] firstSeeNumbers_p1 = {
            "You walk outside to see Rekt a.k.a your buddy standing right beside your post.", //0
            "You are just about to whine to him about your dream last night ... before you see IT!",
            "There is a NUMBER floating on his head! It is a vague and bad-drawn number that reads '21'.\nYou rub your eyes, and rub them again, but the number still persists.",
            "Then Rekt slowly turns around and wave you eagerly... Suddenly there is a FLASH...",
            "To your surprise, the floating number just disappear, into thin air, like nothing ever happened.",
            "Rekt seems to notice your weird expression. He is asking you what was wrong...",
            "\tYou decide to...? \n \t(0) Ask about the number \t (1) Tell your dream last night", //6 . OPTIONS
    };

    /////////////////////////////////// First See Numbers p2

    private String firstSeeNumChoice0_a2 = "You take in a big breath and continue walking. But you feel like your weirdness just gets to another level...";
    private String firstSeeNumChoice0_b2 = "\t# Abnormality went up by 1 #";
    private String firstSeeNumChoice1_a2 = "You tell Rekt cautiously : 'It's like I'm still sleepy'. Immediately, he swings his big palm into your face.\n\tSwear to God you can even see whirling stars now, but at least you don't get suspected.";
    private String firstSeeNumChoice1_b2 = "\t# Abnormality went down by 1 #\n\t# Stamina went down by A LOT #";

    private String[] firstSeeNumbers_p2 = {
            "With no further delay, you and Rekt rush to school as it is a bit late already\nBut it is like your nightmare never ends!... There are the numbers '21' floating on EVERYONE on the street!\n",
            "WHAT THE HECK IS GOING ON?!!",
            "You cannot do anything but gasp before this strange scene, but another flash kicks in, and those numbers just vanish again!",
            "You talk to yourself : 'Maybe I am still not that awake yet...'. So you decide to: \n \t(0) Calm yourself down and keep on \t (1) Ask Rekt to slap you hard in the face\n", //14 . OPTIONS
    };

    /////////////////////////////////// First Death Janitor
    private String[] firstDeath = {
            "\tYou walk into the class, thinking you're late but actually you're not. It seems that people are fussing over something so they ignore you.", // 0
            "...\tThe Chemistry class goes on as usual but the teacher seems a bit troubled. What happened, you wonder...",
            "...\tRekt seems to be quite worried as well. Will you ask him the happening?\n \t(0) Ask him \t (1) Just ignore it", //options . 2
            "...\tAs if he were waiting for your question! He gapses it : 'Dude you know what, our only JANITOR is DEAD!'",
            "...\tThey don't even know what the cause was! He was just, like, straight up dead like that! No injury and no blood, so people suspect it was a breakdown",
            "...\t'But the stuff in his room was a bit shuffled up, I heard so. There's no way he died from a breakdown shit, he is the most healthy person I know!', Rekt hisses.", // 5
            "...\t'Hey dude have you heard it! Our JANITOR is DEAD!' Rekt rushes towards you without you opening your trap.",
            "...\t'So, what do you say, are you coming to his house with me? We can, you know, get in to see the scene!",
            "...\tWhat will you do now, going with him?\n \t(0) Nod and agree \t (1) Nope, stay away from the dead", // options . 8
            "...\tRekt smiles eagerly, 'That's my dude! Alright this evening we will pay him a visit! Don't be late!'",
            "...\t# Courage went up by 2 #\t# Understanding went up by 1 #", // 10
            "...\tRekt knocks on your shoulder, 'What the hell dude?! He was fighting off the bullies for you, remember?! You're coming with me!'",
            "...\t# Courage went down by 1 #\t# Understanding went down by 1 #",
            "...\t +++ NEW AREA OPENED : JANITOR'S HOUSE +++",
    };
    
    ///////////////////////////////////R.event1
    private String Revent1Choice0 = "You get ultra panic and get everyone�s attentions� At least you got into her eyes!"; //5
    private	String Revent1Choice1 = "She thinks you are looking at something behind her� You barely got away";
    private String Revent1Choice2 = "She is absolutely baffled by your actions. What are you doing at the middle of the class!";
    private String Revent1Choice3 = "Wait what� where to run?!?";
    
    private String[] Revent1	= {
    		"\tThere she is... She's making your world a dream with her straight black hair, beautiful blue eyes, pretty bunny nose and angelic smile.", //0
    		"\tJenny, student of Faculty of Literature and your 3 years of crush.",
    		"\tIt is yet another day that you are looking at her and thinking �Will I be able to be the one that smile is directed at?�. ",
    		"\tApparently, while you are lost deep in your dream world she has turned towards you and now you are looking right inti those ocean deep eyes.", 
    		"\tYou're frozen, what to do?\n \t(0) Act as if you haven�t been staring at her last 10 minutes. \n \t(1) Stare at her- Just keep staring... \n \t(2) Wave. \n \t(3) Run for your life. ", //options 4
    };
    
    ///////////////////////////////////R.event2
    private String Revent2Choice0 = "She scolds you for your ignorance, but at least she is not coming to grab you";
    private String Revent2Choice1 = "Rest for the day as firefighters come (You come home to see a firetruck in front of your door� Oh gosh noooo!)";
    private String Revent2Choice2 = "Nothing happened, you don�t have sisters (Are you forgetting about your being the only child?!";
    private String Revent2Choice3 = "Are you freaking texting your mom you�re busy after she calls you 56768 times? I also like to live dangerously";
    
    private String[] Revent2 = {
    		"\tRing ring! Your mom is calling.",
    		"\tDuring all the chaos you have forgotten to go through your daily �did you burn the house, yet?� check, several times.",
    		"\tShe is probably freaking out and ready to call the cops for a missing report. \n \t(0) Answer the call and hope she won't lecture you, too much. \n \t(1) Ignore it and hope she won�t call the firefighters. \n \t(2) Call your sister to save you from Mom's Fury. \n \t(3) Text your mom �I'm busy.�. Actually, never mind, don't do that. No, wait. Don't! ", //options 3
    };

    /////////////////////////////////// Minor Events

    public Dialogue() {
        actionFirstNight.put(0, Arrays.asList(new ChoiceAction[] {new ChoiceAction(firstNightChoice0_a), new ChoiceAction(firstNightChoice0_b)}));
        actionFirstNight.put(1, Arrays.asList(new ChoiceAction[] {new ChoiceAction(firstNightChoice1_a), new ChoiceAction(firstNightChoice1_b)}));
        actionFirstNight.put(2, Arrays.asList(new ChoiceAction[] {new ChoiceAction(firstNightChoice2_a)}));

        actionFirstSeeNum_p1.put(0, Arrays.asList(new ChoiceAction[] {new ChoiceAction(firstSeeNumChoice0_a1), new ChoiceAction(firstSeeNumChoice0_b1)}));
        actionFirstSeeNum_p1.put(1, Arrays.asList(new ChoiceAction[] {new ChoiceAction(firstSeeNumChoice1_a1), new ChoiceAction(firstSeeNumChoice1_b1)}));

        actionFirstSeeNum_p2.put(0, Arrays.asList(new ChoiceAction[] {new ChoiceAction(firstSeeNumChoice0_a2), new ChoiceAction(firstSeeNumChoice0_b2)}));
        actionFirstSeeNum_p2.put(1, Arrays.asList(new ChoiceAction[] {new ChoiceAction(firstSeeNumChoice1_a2), new ChoiceAction(firstSeeNumChoice1_b2)}));
        
        actionREvent1.put(0, Arrays.asList(new ChoiceAction[] {new ChoiceAction(Revent1Choice0) }));
        actionREvent1.put(1, Arrays.asList(new ChoiceAction[] {new ChoiceAction(Revent1Choice1) }));
        actionREvent1.put(2, Arrays.asList(new ChoiceAction[] {new ChoiceAction(Revent1Choice2) }));
        actionREvent1.put(3, Arrays.asList(new ChoiceAction[] {new ChoiceAction(Revent1Choice3) }));
        
        actionREvent2.put(0, Arrays.asList(new ChoiceAction[] {new ChoiceAction(Revent2Choice0) }));
        actionREvent2.put(1, Arrays.asList(new ChoiceAction[] {new ChoiceAction(Revent2Choice1) }));
        actionREvent2.put(2, Arrays.asList(new ChoiceAction[] {new ChoiceAction(Revent2Choice2) }));
        actionREvent2.put(3, Arrays.asList(new ChoiceAction[] {new ChoiceAction(Revent2Choice3) }));
    }

    /////////////////////////////////// Methods

    public String goSomewhere(int position, ArrayList<String> events) {
        String fromPlace = "Where do you want to head to?\n";
        switch (position) {
            case 0:
                fromPlace += toHome + toClassA;
                if (events.contains("MT")) {
                    fromPlace += toMountain;
                }
                if (events.contains("JN")) {
                    fromPlace += toJanitor;
                }
                if (events.contains("VL")) {
                    fromPlace += toTeacher;
                }
                if (events.contains("TT")) {
                    fromPlace += toTattoo;
                }
                if (events.contains("PL")) {
                    fromPlace += toPolice;
                }
                break;
            case 1:
                fromPlace += toHome + toClassA;
                if (events.contains("CB")) {
                    fromPlace += toClassB;
                }
                break;
            case 2:
                fromPlace += toClassA + toClassB;
                if (events.contains("JN")) {
                    fromPlace += toJanitor;
                }
                break;
            case 3:
                fromPlace += toHome + toMountain;
                break;
            case 4:
                fromPlace += toHome + toJanitor;
                break;
        }
        return fromPlace;
    }

    public String getGeneralOpts() {
        return this.generalOpts;
    }

    public String getExploreItems() {
        return this.exploreItems;
    }

    public String getEndDay() {
        return this.endDay;
    }

    public String getStillFull() {
        return this.stillFull;
    }

    public String[] getFirstNight() {
        return this.firstNight;
    }

    public String[] getFirstSeeNumbers_p1() {
        return this.firstSeeNumbers_p1;
    }

    public String[] getFirstSeeNumbers_p2() {
        return this.firstSeeNumbers_p2;
    }
    
    public String[] getREvent1()	{
    	return this.Revent1;
    }
    
    public String[] getREvent2()	{
    	return this.Revent2;
    }
    
    public String getJanitorNote() {
        return janitorNote;
    }

    public HashMap<Integer, List<ChoiceAction>> getActionFirstNight() {
        return actionFirstNight;
    }

    public HashMap<Integer, List<ChoiceAction>> getActionFirstSeeNum_p1() {
        return actionFirstSeeNum_p1;
    }

    public HashMap<Integer, List<ChoiceAction>> getActionFirstSeeNum_p2() {
        return actionFirstSeeNum_p2;
    }
    
    public HashMap<Integer, List<ChoiceAction>> getActionREvent1()	{
    	return actionREvent1;
    }

    public HashMap<Integer, List<ChoiceAction>> getActionREvent2()	{
    	return actionREvent2;
    }

    public String getFirstNightEnd() {
        return "Eventually, the darkness slowly fades away ... But the creepy feeling keeps on and prolongs throughout the night. It was a very haunting dream...";
    }
}
