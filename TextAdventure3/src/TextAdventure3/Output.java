package TextAdventure3;

import javax.swing.JTextArea;


public class Output
{
	public static String Out(int a, String b, JTextArea l)
	{
		switch (b)
			{
			case "Where":
			case "where":
				return "You are in " + Place(a);

			default:
				switch (a)
					{
					case 0:
						return Cell(a, b, l);

					case 1:
						return Common(a, b, l);

					case 2:
						return Ladder(a, b, l);

					case 3:
						return Panopticon(a, b, l);

					case 4:
						return PconF(a, b, l);

					case 5:
						return PconU(a, b, l);

					case 6:
						return PconUF(a, b, l);

					case 7:
						return ComF(a, b, l);

					case 8:
						return ComU(a, b, l);

					case 9:
						return ComUF(a, b, l);

					default:
						a = 0;
						return "You seem to be lost. You return to your cell to get your bearings.";
					}
			}
	}

	public static String Cell(int a, String b, JTextArea l)
	{
		switch (b)
			{
			case "1928":
				return "You input 1928 into the keypad. Well done! The cell door unlocks and you enter the common area.";

			case "Read":
			case "read":
				JotDown(l, "1928");
				return "Under many tally marks, doodles, and diary entries, you see the numbers 1928 written on the wall";
			case "Pick","pick":
				return "You mess with hairclip to form a pick. You begin to pick the analog part of the lock"
						+ "\nWell done! The cell door unlocks and you enter the common area.";

			case "Search":
			case "search":
				JotDown(l, "Read");
				JotDown(l,"Pick");
				return "Surveying your surroundings, you see the writing on the wall, and a hair clip";

			default:
				return "You don't understand how to do that, or you're not sure what that is. Try to 'Search' your surroundings";
			}
	}

	public static String Common(int a, String b, JTextArea l)
	{
		switch (b)
			{
			case "Search":
			case "search":
				JotDown(l, "Ladder");
				JotDown(l, "Plate");
				return "Surveying your surroundings, you see a ladder up to the Panopticon and some tables with metal plates";

			case "ladder":
			case "Ladder":
				return "You climb up the ladder to a window to the controll center";

			case "Plate":
			case "plate":
				return "You pick up one of the plates, the metal feels sturdy";

			default:
				return "You don't understand how to do that, or you're not sure what that is. Try to 'Search' your surroundings";
			}
	}

	public static String Ladder(int a, String b, JTextArea l)
	{
		switch (b)
			{
			case "Search":
			case "search":
				JotDown(l, "Down");
				JotDown(l,"Scratch");
				JotDown(l, "Punch");
				JotDown(l, "Pick");
				return "You see a normal glass window and a few options come to mind";
			case "Ladder","ladder","Down","down":
				return "You climb back down the ladder";
			case "Punch","punch":
				return"You don't consider this the best choice, or the smartest, but it will work \nThis is going to hurt\n"
						+ "punch\npunch\npunch\nIt breaks your hand is cut up and bruised but you're in";
			case "Pick","pick":
				return "The hairclip from your cell has turned out to be pretty useful. You enter";
			case "Plate","plate":
				return "The plate with its hard edge is very effective in breaking the glass. "
						+ "\nWith some care, to not cut yourself, you enter with ease.";
			case "Scratch","scratch":
				return "That was not very effective. At least it left a mark.";

			default:
				return "You don't understand how to do that, or you're not sure what that is. Try to 'Search' your surroundings";
			}
	}

	public static String Panopticon(int a, String b, JTextArea l)
	{
		switch (b)
			{
			case "Search":
			case "search":
				JotDown(l, "Unlock");
				JotDown(l, "Fire Alarm");
				JotDown(l, "Reset");
				JotDown(l, "Lockdown");
				JotDown(l,"Down");
				return "Out of the many controls you see, a couple have lables";
			case "Unlock", "unlock":
				return "You turn a knob and hear some heavy doors slide open\n"
						+ "Behind you in the main hall you see the main entrance is open";
			case "Fire Alarm", "fire alarm":
				return "The sprinklers turn on and a siren blares\nIt is not pleasant\n"
						+ "However you see a fire exit light up in the main hall";
			case "Reset","reset":
				return "You press a button\nAll the lights shut off and you hear the background noise cease\nYou are pretty alone here"
						+ "\nWhat happened and why are you here\nYou hear things turn back on and the lights are back\n"
						+ "You can see again and think to ponder these questions later";
			case "Lockdown","lockdown":
				return "As you flip a switch a very loud siren is set off as doors are automatically locked and the lights flash red\n"
						+ "It is very alarming\nYou scramble to shut it off\nMaybe don't do that one again";
			case "Down","down":
				return "You get out of the control room through the window";
			default:
				return "You don't understand how to do that, or you're not sure what that is. Try to 'Search' your surroundings";
			}
	}

	public static String PconF(int a, String b, JTextArea l)
	{
		switch (b)
			{
			case "Search":
			case "search":
				JotDown(l, "Unlock");
				JotDown(l, "Fire Alarm");
				JotDown(l, "Reset");
				JotDown(l, "Lockdown");
				JotDown(l,"Down");
				return "Out of the many controls you see, a couple have lables";
			case "Unlock", "unlock":
				return "You turn a knob and hear some heavy doors slide open\n"
						+ "Behind you in the main hall you see the main entrance is open";
			case "Fire Alarm", "fire alarm":
				return "Flipping the Fire alarm again does nothing. /nYou probably can't turn it back off";
			case "Reset","reset":
				return "You press a button\nAll the lights shut off and you hear the background noise cease\nYou are pretty alone here"
						+ "\nWhat happened and why are you here\nYou hear things turn back on and the lights are back\n"
						+ "You can see again and think to ponder these questions later";
			case "Lockdown","lockdown":
				return "As you flip a switch a very loud siren is set off as doors are automatically locked and the lights flash red\n"
						+ "It is very alarming\nYou scramble to shut it off\nMaybe don't do that one again";
			case "Down","down":
				return "You get out of the control room through the window";
			default:
				return "You don't understand how to do that, or you're not sure what that is. Try to 'Search' your surroundings";
			}
	}

	public static String PconU(int a, String b, JTextArea l)
	{
		switch (b)
			{
			case "Search":
			case "search":
				JotDown(l, "Unlock");
				JotDown(l, "Fire Alarm");
				JotDown(l, "Reset");
				JotDown(l, "Lockdown");
				JotDown(l,"Down");
				return "Out of the many controls you see, a couple have lables";
			case "Unlock", "unlock":
				return "The door makes a click sound again, but doesn't move.\n"
						+ "There is probably a lock button but you can't find it";
			case "Fire Alarm", "fire alarm":
				return "The sprinklers turn on and a siren blares\nIt is not pleasant\n"
						+ "However you see a fire exit light up in the main hall";
			case "Reset","reset":
				return "You press a button\nAll the lights shut off and you hear the background noise cease\nYou are pretty alone here"
						+ "\nWhat happened and why are you here\nYou hear things turn back on and the lights are back\n"
						+ "You can see again and think to ponder these questions later";
			case "Lockdown","lockdown":
				return "As you flip a switch a very loud siren is set off as doors are automatically locked and the lights flash red\n"
						+ "It is very alarming\nYou scramble to shut it off\nMaybe don't do that one again";
			case "Down","down":
				return "You get out of the control room through the window";
			default:
				return "You don't understand how to do that, or you're not sure what that is. Try to 'Search' your surroundings";
			}
	}

	public static String PconUF(int a, String b, JTextArea l)
	{
		switch (b)
			{
			case "Search":
			case "search":
				JotDown(l, "Unlock");
				JotDown(l, "Fire Alarm");
				JotDown(l, "Reset");
				JotDown(l, "Lockdown");
				JotDown(l,"Down");
				return "Out of the many controls you see, a couple have lables";
			case "Unlock", "unlock":
				return "The door makes a click sound again, but doesn't move.\n"
						+ "There is probably a lock button but you can't find it";
			case "Fire Alarm", "fire alarm":
				return "Flipping the Fire alarm again does nothing. /nYou probably can't turn it back off";
			case "Reset","reset":
				return "You press a button\nAll the lights shut off and you hear the background noise cease\nYou are pretty alone here"
						+ "\nWhat happened and why are you here\nYou hear things turn back on and the lights are back\n"
						+ "You can see again and think to ponder these questions later";
			case "Lockdown","lockdown":
				return "As you flip a switch a very loud siren is set off as doors are automatically locked and the lights flash red\n"
						+ "It is very alarming\nYou scramble to shut it off\nMaybe don't do that one again";
			case "Down","down":
				return "You get out of the control room through the window";
			default:
				return "You don't understand how to do that, or you're not sure what that is. Try to 'Search' your surroundings";
			}
	}

	public static String ComF(int a, String b, JTextArea l)
	{
		switch (b)
		{
		case "search":
			JotDown(l, "Ladder");
			JotDown(l, "Plate");
			JotDown(l,"Fire escape");
			return "Surveying your surroundings, you see a ladder up to the Panopticon and some tables with metal plates\n"
					+ "and now open main entrance and fire escape";
		case "Ladder","ladder":
			return"You climb back up to the control room";
		case "Plate","plate":
			return "The plate over there calls to you\nYou pick it up. It calms you";
		case "fire escape","Fire escape","Fire Escape":
		case "exit","Exit":
			return "As annoying as it is to get wet and hear the siren you're glad the exit is open\n"
					+ "You open the door to a brave new world";
		default:
			return "You don't understand how to do that, or you're not sure what that is. Try to 'Search' your surroundings";
		}
	}

	public static String ComU(int a, String b, JTextArea l)
	{
		switch (b)
		{
		case "search":
			JotDown(l, "Ladder");
			JotDown(l, "Plate");
			JotDown(l,"Main exit");
			return "Surveying your surroundings, you see a ladder up to the Panopticon and some tables with metal plates\n"
					+ "and now open main entrance and fire escape";
		case "Ladder","ladder":
			return"You climb back up to the control room";
		case "Plate","plate":
			return "The plate over there calls to you\nYou pick it up. It calms you";
		case "main exit","Main exit","Main Exit":
		case "exit","Exit":
			return "Nothing is in your way before the front door\n"
					+ "You walk past some vistation rooms and guards quarters to, hopefully, freedom";
		default:
			return "You don't understand how to do that, or you're not sure what that is. Try to 'Search' your surroundings";
		}
	}

	public static String ComUF(int a, String b, JTextArea l)
	{
		switch (b)
			{
			case "search":
				JotDown(l, "Ladder");
				JotDown(l, "Plate");
				JotDown(l,"Fire escape");
				JotDown(l,"Main exit");
				return "Surveying your surroundings, you see a ladder up to the Panopticon and some tables with metal plates\n"
						+ "and now open main entrance and fire escape";
			case "Ladder","ladder":
				return"You climb back up to the control room";
			case "Plate","plate":
				return "The plate over there calls to you\nYou pick it up. It calms you";
			case "fire escape","Fire escape","Fire Escape":
				return "As annoying as it is to get wet and hear the siren you're glad the exit is open\n"
						+ "You open the door to a brave new world";
			case "main exit","Main exit","Main Exit":
				return "Nothing is in your way before the front door\n"
						+ "You walk past some vistation rooms and guards quarters to, hopefully, freedom";
			default:
				return "You don't understand how to do that, or you're not sure what that is. Try to 'Search' your surroundings";
			}
	}

	public static void Open(int a, JTextArea k)
	{
		String x;
		switch (a)
			{
			case 0:
				x = "You awake in some kind of prison cell. You see some writing on the wall, and a door with a key pad";
				k.append("--" + x + "\n");
				break;

			case 1:
				x = "The main hall with cells form a circle around a Panopticon, it has a control center, but you don't see anyone inside\n";
				k.append("--" + x + "\n");
				break;

			case 2:
				x = "This is quite a scary height. Hopefully you can find a way in";
				k.append("--" + x + "\n");
				break;
			case 3:
				x = "Safely inside you see a control panel with a number of knobs, buttons, and dials";
				k.append("--" + x + "\n");
				break;
			case 7, 8, 9:
				x = "You've returned to the main hall";
				k.append("--" + x + "\n");
				break;
			case 10:
				x = "You open the fire escape to a warehouse you do not recognize"
						+ "\nCongrats you escaped you may exit the game";
				k.append("--" + x + "\n");
				break;
			case 11:
				x = "You open the main entrance to an empty field you do not recognize"
						+ "\nCongrats you escaped you may exit the game";
				k.append("--" + x + "\n");
				break;
			default:
				return;
			}
	}

	public static void JotDown(JTextArea l, String b)
	{
		l.append(b + "\n");
	}

	public static int MayUp(int a, String b, JTextArea k, JTextArea l)
	{
		switch (a)
			{
			case 0:
				switch (b)
					{
					case "1928","Pick","pick":
						Open(1, k);
						l.setText("Notes:\n");
						return 1;

					default:
						return 0;
					}
			case 1:
				switch (b)
					{
					case "Ladder","ladder":
						Open(2, k);
						return 1;

					default:
						return 0;
					}
			case 2:
				switch (b)
					{
					case "Down","down":
					case "Ladder","ladder":
						l.setText("Notes:\n");
						return -1;

					case "punch", "Punch":
					case "Plate", "plate":
					case "pick", "Pick":
						l.setText("Notes:\n");
						Open(3,k);
						return 1;

					default:
						return 0;
					}
			case 3:
				switch (b)
					{
					case "Fire Alarm", "fire alarm":
						return 1;

					case "Unlock", "unlock":
						return 2;

					case "Down":
					case "down":
						l.setText("Notes:\n");
						JotDown(l, "Where");
						return -1;

					default:
						return 0;
					}
			case 4:
				switch (b)
					{
					case "Unlock", "unlock":
						return 2;

					case "Down":
					case "down":
						l.setText("Notes:\n");
						Open(7,k);
						return 3;

					default:
						return 0;
					}
			case 5:
				switch (b)
					{
					case "Fire Alarm", "fire alarm":
						return 1;

					case "Down":
					case "down":
						l.setText("Notes:\n");
						Open(8,k);
						return 3;

					default:
						return 0;
					}
			case 6:
				switch (b)
					{
					case "Down":
					case "down":
						l.setText("Notes:\n");
						Open(9,k);
						return 3;

					default:
						return 0;
					}
			case 7:
				switch (b)
					{
					case "exit","Exit":
					case "fire escape","Fire escape","Fire Escape":
						l.setText("Notes:\n");
					Open(10,k);
						return 3;
					case "Ladder","ladder":
						JotDown(l, "Where");
						return -3;
					default:
						return 0;
					}
			case 8:
				switch (b)
					{
					case "exit","Exit":
					case "main exit","Main exit","Main Exit":
						l.setText("Notes:\n");
					Open(11,k);
						return 3;
					case "Ladder","ladder":
						JotDown(l, "Where");
						return -3;
					default:
						return 0;
					}
			case 9:
				switch (b)
					{
					case "fire escape","Fire escape","Fire Escape":
						l.setText("Notes:\n");
					Open(10,k);
						return 1;
					case "main exit","Main exit","Main Exit":
						Open(11,k);
						return 2;
					case "Ladder","ladder":
						JotDown(l, "Where");
						return -3;
					default:
						return 0;
					}
			default:
				return 0;
			}
	}

	public static String Place(int a)
	{
		switch (a)
			{
			case 0:
				return "your cell";

			case 1, 7, 8, 9:
				return "main hall";

			case 2:
				return "outside the window to the control center";

			case 3, 4, 5, 6:
				return "inside the panopticon/control center";

			default:
				return "a place you don't recognize";
			}
	}
}
