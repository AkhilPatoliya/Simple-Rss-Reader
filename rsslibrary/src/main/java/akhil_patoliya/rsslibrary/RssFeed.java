package akhil_patoliya.rsslibrary;

import java.util.List;

/**
 * RSS Feed response model
 */

public class RssFeed {

    /**
     * List of parsed {@link RssItem} objects
     */
    private List<RssItem> mItems;

    public List<RssItem> getItems() {
        return mItems;
    }

    void setItems(List<RssItem> items) {
        mItems = items;
    }
}
