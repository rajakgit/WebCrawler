package com.proj.crawler;

import java.util.ArrayList;

public class SpiderTest
{
    /**
     * This is our test. It creates a spider (which creates spider legs) and crawls the web.
     * 
     * @param args - URL to be passed in command line
     *            
     */
    public static void main(String[] args)
    {
        Spider spider = new Spider();
        ArrayList<String> listOfUrls = new ArrayList<String>();
        
        if (args.length != 2)
        	throw new IllegalArgumentException("Minimum number of arguments should be 2. One is URL(s) and another is word to search");
              
        for(String strUrl:args)
        {
        	listOfUrls.add(strUrl);
        }

        // Last parameter is the word to search
        String strWordSearch = args[args.length-1];
 
        // Remove the last argument from the list
        listOfUrls.remove(args.length-1);
        
        spider.iterateList(listOfUrls, strWordSearch);
        
    }
}