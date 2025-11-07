package CollectionFrameworkInJava;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import JavaPrograms.WhileLoopEx;

public class MusicPlaylist 
{
	private static LinkedList<String> playlist = new LinkedList<String>();
	private static ListIterator<String> iterator;
	private static String currentSongs=null;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("Welcome to Jio Savan Playlist");
			
			do {
				showMenu();
				System.out.println("Enter your choice: ");
				choice=sc.nextInt();
				sc.nextLine();
				
				switch (choice)
				{
				case 1:
					System.out.println("Enter song name to add: ");
					String song = sc.nextLine();
					playlist.add(song);
					System.out.println("Song is Added: "+song);
					break;
					
				case 2:
					System.out.println("Enter song name to remove: ");
					String songToremove = sc.nextLine();
					if(playlist.remove(songToremove))
					{
						System.out.println("Removed :" +songToremove);
					}
					else
					{
						System.out.println("Song is not found");
					}
					break;
					
				case 3:
					playNextSong();
					break;
					
				case 4:
					playPreviousSong();
					break;
					
				case 5:
					showCurrentSong();
					break;
					
				case 6:
					showPlaylist();
					break;
					
				case 0:
					System.out.println("Exit the playlist");
					break;
					
				default:
					System.out.println("Invalid Choice ... Please Try again");

				}	
				
			}while(choice !=0 );
	}
	private static void showMenu() 
	{
		System.out.println("Playlist Menu");
		System.out.println("1. Add Song");
		System.out.println("2. Remove Song");
		System.out.println("3. Play Next Song");
		System.out.println("4. Play Previous Song");
		System.out.println("5. Show current song");
		System.out.println("6. Show playlist");
		System.out.println("0. Exit");
	}
	private static void playNextSong() 
	{
		if(!playlist.isEmpty())
		{
			if(iterator == null)
			{
				iterator = playlist.listIterator();
			}
			
			if(iterator.hasNext())
			{
				currentSongs = iterator.next();
				System.out.println("Now Playing :"+ currentSongs);
			}
			else
			{
				System.out.println("Playlist limit reached..");
			}
		}
		else {
			System.out.println("Playlist is empty..");

		}
		
	}

	private static void showPlaylist() 
	{
		System.out.println("Playlist ..");
		if(playlist.isEmpty())
		{
			System.out.println("Playlist is empty....add songs press 1");
		}
		else
		{
			int i =1;
			for(String song : playlist)
			{
				System.out.println(i++ + " . " + song);
			}
		}
	}

	private static void showCurrentSong() 
	{
		if(currentSongs != null)
		{
			System.out.println("Current Song is "+ currentSongs);
		}
		else
		{
			System.out.println("No song is currently playing");
		}
		
	}

	private static void playPreviousSong() 
	{
		if(!playlist.isEmpty())
		{
			if(iterator == null)
			{
				iterator = playlist.listIterator();
			}
			
			if(iterator.hasPrevious())
			{
				currentSongs = iterator.previous();
				System.out.println("Now Playing :"+ currentSongs);
			}
			else
			{
				System.out.println("You are at the start of the playlist");
			}
		}else {
			System.out.println("Playlist is empty..");

		}
		
	}

	

	

}
