package CodingExamples;

public class PhraseOMatic {

	public static void main(String[] args) {
		/*
		 * OK, so the beer song wasn’t really a serious business application. Still need
		 * something practical to show the boss? Check out the Phrase-O-Matic code.
		 */

		// make three sets of words to choose from. Add your own!
		String[] wordListOne = { "24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", " frontend", "web-based",
				"pervasive", "smart", "sixsigma", "critical-path", "dynamic" };
		String[] wordListTwo = { "empowered", "sticky", " value-added", " oriented", "centric", " distributed",
				" clustered", " branded", " outside-the-box", "positioned", " networked", "focused", "leveraged",
				"aligned", "targeted", "shared", "cooperative", "accelerated" };
		String[] wordListThree = { "process", "tippingpoint", "solution", "architecture", " core competency",
				"strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission" };
		// find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		// generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		// now build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		// print out the phrase
		System.out.println("What we need is a " + phrase);
	}

}
