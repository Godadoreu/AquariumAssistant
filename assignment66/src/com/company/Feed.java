package com.company;

public class Feed extends Accessories {
    private String feedName;
 private String name;
    public Feed( int price, String feedName) {
        super(price);
        this.feedName = feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public String getFeedName() {
        return feedName;
    }

    @Override
    public String toString() {
        return super.toString()+"Feed{" +
                "feedName='" + feedName + '\'' +
                '}';
    }

    @Override
    public String use() {
        return "Feed is used to nourish the animals in Aquarium";
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }
}
