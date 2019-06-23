package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import _00_Sorting_Algorithms.SortingVisualizer;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		return eggs.indexOf("cracked");
	}
	public static int countPearls(List<Boolean> bs)
	{
		int r = 0;
		for (boolean b : bs)
		{
			if (b==true) r++;
		}
		return r;
	}
	public static double findTallest(List<Double> peeps)
	{
		double t = 0;
		for (double d : peeps)
		{
			if (t < d) t = d;
		}
		return t;
	}
	public static String findLongestWord(List<String> ws)
	{
		int t = ws.get(0).length();
		String r = ws.get(0);
		for (String s : ws)
		{
			if (s.length() > r.length()) r = s; t = r.length();
		}
		return r;
	}
	//containsSOS
	public static boolean containsSOS(List<String> s)
	{
		return s.indexOf(" ... --- ... ")>=0;
	}
	public static List<Double> sortScores(Double[] results)
	{
		for (int i = 0; i < results.length; i++)
		{
			for (int j = 1; j < results.length - i; j++)
			{
				if (results[j - 1] > results[j])
				{
					double temp = results[j-1];
					results[j-1] = results[j];
					results[j] = temp;
				}
			}
		}
		List<Double> r = new ArrayList<Double>();
		for (double d : results)
		{
			r.add(d);
		}
		return r;
	}
	public static List<String> sortDNA (List<String> dna)
	{
		while (isSorted(dna)!=true)
		{
			for (int i = 1; i < dna.size(); i++)
			{
				if (dna.get(i-1).length() > dna.get(i).length())
				{
					String temp = dna.get(i-1);
					dna.set(i-1, dna.get(i));
					dna.set(i, temp);
				}
			}
		}
		return dna;
	}
	
	public static boolean isSorted(List<String> arr)
	{
		for (int i = 1; i < arr.size(); i++)
		{
			if (arr.get(i-1).length() > arr.get(i).length()) return false;
		}
		return true;
	}
	public static List<String> sortWords(List<String> words) {
		for (int j = 0; j<words.size(); j++)
		{
			for (int i = 1; i < words.size(); i++)
			{
				if (words.get(i-1).compareTo(words.get(i)) >= 0)
				{
					String temp = words.get(i-1);
					words.set(i-1, words.get(i));
					words.set(i, temp);
				}
			}
		}
		return words;
	}
}
