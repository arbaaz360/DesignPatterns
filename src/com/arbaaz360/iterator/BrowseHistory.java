package com.arbaaz360.iterator;


import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();
    private List<String> getUrls(){
        return urls;
    }

    public Iterator createIterator(){
        return new ListIterator(this);
    }

    public void push(String url){
        urls.add(url);
    }
    public String pop(){
        var lastIndex = urls.size()-1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public void ForEach(){

    }


    public class ListIterator implements Iterator<String>{
        private BrowseHistory history;
        private int index;
        public ListIterator(BrowseHistory history){
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return (String)history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }



}
