package model.objects;

import com.sun.istack.internal.NotNull;

/**
 * Objects of this class represent
 * getDelegates attending the MUN conference.
 *
 * Each delegate will be loaded from database
 * at the start of each session or created
 * at the beginning of a conference.
 * When loaded from database,
 * the constructor with six parameters should be called;
 * otherwise the constructor with two parameters.
 */
public class Delegate {

    /**
     * The name of delegate.
     */
    private String name;

    /**
     * The nation a delegate represents.
     */
    private String nation;

    /**
     * The number of motions a delegate called for.
     *
     * The value of this variable should be equal to
     * or greater than the value of {@code numberOfSuccessfulMotions}.
     */
    private int numberofTotalMotions;

    /**
     * The number of motions that pass.
     *
     * When a motion is passes,
     * both variables {@code numberOfTotalMotions} and
     * this variable should
     * automatically increase by one;
     * otherwise, only {@code numberOfTotalMotions} should increase by one.
     */
    private int numberOfSuccessfulMotions;

    /**
     * The number of times when the delegate is
     * present throughout the conference.
     *
     * The value of this variable should be equal to
     * or less than the number of sessions of the conference.
     */
    private int numberofPresence;

    /**
     * The number of speeches a delegate
     * delivers throughout the conference.
     */
    private int numberOfSpeeches;

    /**
     * This constructor should be called when
     * data is loaded from database
     * at the beginning of each session.
     */
    public Delegate(String name, String nation, int numberofTotalMotions,
                    int numberOfSuccessfulMotions, int numberofPresence, int numberOfSpeeches) {
        this.name = name;
        this.nation = nation;
        this.numberofTotalMotions = numberofTotalMotions;
        this.numberOfSuccessfulMotions = numberOfSuccessfulMotions;
        this.numberofPresence = numberofPresence;
        this.numberOfSpeeches = numberOfSpeeches;
    }

    /**
     * This consturctor should be called when
     * model.objects.Delegate object is create for the first time
     * at the beginning of conference.
     */
    public Delegate(@NotNull String name, @NotNull String nation) {
        this(name, nation, 0, 0, 0, 0);
    }

//    private model.objects.Delegate(Buidlder buidlder) {
//        this.name = buidlder.name;
//        this.nation = buidlder.nation;
//        this.numberOfSpeeches = buidlder.numberOfSpeeches;
//        this.numberOfSuccessfulMotions = buidlder.numberOfSuccessfulMotions;
//        this.numberofTotalMotions = buidlder.numberofTotalMotions;
//        this.numberofPresence = buidlder.numberofPresence;
//    }

    /**
     * This method should be called when
     * a motion the delegate calls for passes.
     */
    public void increaseNumOfSuccessfulMotion() {
        ++numberOfSuccessfulMotions;
        ++numberofTotalMotions;
    }

    /**
     * This method should be called when
     * a motion the delegate calls for fails.
     */
    public void increaseNumOfPresence() {
        ++numberofPresence;
    }

    /**
     * This method should be called when
     * delegate deliver a speech in a motion.
     */
    public void increaseNumOfSpeeches() {
        ++numberOfSpeeches;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public int getNumOfTotalMotions() {
        return numberofTotalMotions;
    }

    public int getNumOfSuccessfulMotions() {
        return numberOfSuccessfulMotions;
    }

    public int getNumOfPresence() {
        return numberofPresence;
    }

    public int getNumOfSpeeches() {
        return numberOfSpeeches;
    }

//    public class Buidlder {
//        private String name;
//        private String nation;
//
//        private int numberofTotalMotions = 0;
//        private int numberOfSuccessfulMotions = 0;
//        private int numberofPresence = 0;
//        private int numberOfSpeeches = 0;
//
//        public Buidlder(String name, String nation) {
//            this.name = name;
//            this.nation = nation;
//        }
//
//        public Buidlder setTotoalMotions(int totoalMotions) {
//            this.numberofTotalMotions = totoalMotions;
//        }
//
//        public Buidlder setSuccessfulMotions(int successfulMotions) {
//            this.numberOfSuccessfulMotions = successfulMotions;
//        }
//
//        public Buidlder setPresence(int presence) {
//            this.numberofPresence = presence;
//        }
//
//        public Buidlder setAddress(int address) {
//            this.numberOfSpeeches = address;
//        }
//
//        public model.objects.Delegate build() {
//            return new model.objects.Delegate(this);
//        }
//    }
}
