package com.arbaaz360.iterator;

import javax.swing.plaf.ActionMapUIResource;
import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }
    public String pop(){
        var lastIndex = urls.size()-1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }
    public List<String> getUrls(){
        return urls;
    }
    public class ListIterator implements Iterator<T>{
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
        public T current() {
            return (T)history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

}
