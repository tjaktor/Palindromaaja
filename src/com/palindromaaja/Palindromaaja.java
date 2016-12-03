package com.palindromaaja;

import java.util.Scanner;

/**
 * Sovellus kysyy sanaa ja ilmoittaa onko kyseess� palindromi.
 */
public class Palindromaaja {

	public static void main(String[] args) {
		
		/**
		 * K�ytt�j�n antama testattava sana.
		 */
		String inputString;
		
		try ( Scanner scanner = new Scanner( System.in ) )
		{
			while( true )
			{
				System.out.println( "Anna sana jonka haluat k��nt�� toisinp�in (exit lopettaa):" );
				
				inputString = scanner.nextLine();
				
				if ( inputString.isEmpty() )
				{
					System.out.println( "Et antanut mit��n sanaa!" );
				}
				else if ( inputString.equals( "exit" ) )
				{
					System.exit(0);
				}
				else if ( palindromeTest( inputString ) )
				{
					System.out.println( "Kyseess� on palindromi!" );
				}
				else
				{
					System.out.println( "Kyseess� ei ole palindromi!" );
				}
			}
		}
		catch ( Exception ex )
		{
			// Virheen kirjaus tms.
			
			System.exit(0);
		}
	}
	
	/**
	 * Palauttaa true:n jos annettu sana on sama toisinkin p�in
	 * @param word
	 * @return Boolean
	 */
	public static Boolean palindromeTest( String word )
	{		
		String wordBackwards = inputBackwards( word );
		
		if ( word.equals( wordBackwards ) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * K��nt�� sanan toisinp�in
	 * @param inputString
	 * @return String
	 */
	public static String inputBackwards( String inputString )
	{
		String backwards = "";
		
		int inputLength = inputString.length();
		
		for( int i = inputLength - 1; i >= 0; i-- )
		{
			backwards = backwards + inputString.charAt( i );
		}
	
		return backwards;
	}
}
