package com.ashazar.tabdrawer.model;

import android.graphics.Typeface;

import java.util.ArrayList;

/**
 * TabArray model (Everything -all tabs and their list items- included) for TabDrawer
 * <p>
 * Created by Serdar Hazar on 25/11/16.
 */
public class TabArray {
    private ArrayList<Tab> tabArray = null;
    
    private int tabLayoutResourceId = 0;
    private int tabBackgroundColor = 0;
    private int tabBackgroundColor_selected = 0;
    private int tabBackgroundColor_selectedInactive = 0;
    private Typeface tabTitleFont = null;
    private int tabTitleSize = 12;
    private int tabTitleColor = 0;
    private int tabTitleColor_selected = 0;
    private int tabTitleColor_selectedInactive = 0;
    private int tabIconColor = 0;
    private int tabIconColor_selected = 0;
    private int tabIconColor_selectedInactive = 0;
    private boolean animateScaleTabIconWhenSelected = true;
    private float tabIconScaleValueWhenSelected = 1.2f;
    private boolean boldTabTitleWhenSelected = true;

    private int tabListItemTextColor = 0;
    private int tabListItemTextSize = 16;

    /**
     * Instantiates a new Tab array.
     */
    public TabArray() { tabArray = new ArrayList<>(); }

    /**
     * Adds a Tab to TabArray.
     *
     * @param tab the Tab
     * @return the TabArray
     */
    public TabArray addTab(Tab tab) {
        if (tabTitleColor_selected == 0)
            tabTitleColor_selected = tabTitleColor;

        if (tabTitleColor_selectedInactive == 0)
            tabTitleColor_selectedInactive = tabTitleColor;

        /*  Before adding the Tab,
            set general Tab properties (custom Tab layout, background color, title color&size, colors when tab is selected, etc.)
            set TabListItem's text color and text size, if not set before.
         */
        if (tab.getCustomTabLayoutResourceId() == 0)
            tab.setCustomTabLayoutResourceId(tabLayoutResourceId);

        if (tab.getBackgroundColor() == 0)
            tab.setBackgroundColor(tabBackgroundColor);

        if (tab.getSelectedBackgroundColor() == 0)
            tab.setSelectedBackgroundColor(tabBackgroundColor_selected);

        if (tab.getInactiveSelectedBackgroundColor() == 0)
            tab.setInactiveSelectedBackgroundColor(tabBackgroundColor_selectedInactive);

        if (tab.getTitleFont() == null)
            tab.setTitleFont(tabTitleFont);

        if (tab.getTitleSize() == 0)
            tab.setTitleSize(tabTitleSize);

        if (tab.getTitleColor() == 0)
            tab.setTitleColor(tabTitleColor);

        if (tab.getSelectedTitleColor() == 0)
            tab.setSelectedTitleColor(tabTitleColor_selected);

        if (tab.getInactiveSelectedTitleColor() == 0)
            tab.setInactiveSelectedTitleColor(tabTitleColor_selectedInactive);

        if (tab.getIconColor() == 0)
            tab.setIconColor(tabIconColor);

        if (tab.getSelectedIconColor() == 0)
            tab.setSelectedIconColor(tabIconColor_selected);

        if (tab.getInactiveSelectedIconColor() == 0)
            tab.setInactiveSelectedIconColor(tabIconColor_selectedInactive);

        if (tab.getAnimateScaleIconWhenSelected())
            tab.setAnimateScaleIconWhenSelected(animateScaleTabIconWhenSelected);

        if (tab.getIconScaleValueWhenSelected() == 1.2f)
            tab.setIconScaleValueWhenSelected(tabIconScaleValueWhenSelected);

        if (tab.getBoldTitleWhenSelected())
            tab.setBoldTitleWhenSelected(boldTabTitleWhenSelected);

        /*  Before adding the Tab,
            set TabListItem's text color and text size, if not set before.
         */
        if (tab.getListItemTextColor() == 0) {
            for (TabListItem tabListItem : tab.getTabItemList()) {
                tabListItem.setTextColor(tabListItemTextColor);
            }
        }

        if (tab.getListItemTextSize() == 0) {
            for (TabListItem tabListItem : tab.getTabItemList()) {
                tabListItem.setTextSize(tabListItemTextSize);
            }
        }

        tabArray.add(tab);
        return this;
    }

    /**
     * Gets the Tab at given position
     *
     * @param position the position
     * @return the Tab at given position
     */
    public Tab getTab(int position) { return tabArray.get(position); }

    /**
     * Get the tab count of TabArray.
     *
     * @return the size of the array
     */
    public int getTabCount() { return tabArray.size(); }

    /**
     * Sets the Layout Resource Id of tabs
     * All tabs will use this layout, unless a specific layout for a tab not set
     *
     * @param resourceId Resource Layout Id of the tabs
     * @return the TabArray
     */
    public TabArray setCustomTabLayoutResourceId(int resourceId) {
        tabLayoutResourceId = resourceId;
        return this;
    }

    /**
     * Get the layout resource Id for the tabs
     *
     * @return int Tab Layout Resource Id
     */
    public int getCustomTabLayoutResourceId() { return tabLayoutResourceId; }

    /**
     * Sets background color for all tabs.
     *
     * @param color the color
     * @return the TabArray
     */
    public TabArray setTabBackgroundColor(int color) {
        tabBackgroundColor = color;
        return this;
    }

    /**
     * Gets background color for all tabs.
     *
     * @return the tab background color
     */
    public int getTabBackgroundColor() { return tabBackgroundColor; }

    /**
     * Sets background color for selected tab.
     *
     * @param color the color
     * @return the TabArray
     */
    public TabArray setSelectedTabBackgroundColor(int color) {
        tabBackgroundColor_selected = color;
        return this;
    }

    /**
     * Gets background color for the selected tab.
     *
     * @return the selected tab background color
     */
    public int getSelectedTabBackgroundColor() { return tabBackgroundColor_selected; }

    /**
     * Sets background color for inactive selected tab
     * (active tab, but temporarily inactive because another tab is clicked and the drawer opened).
     *
     * @param color the color
     * @return the TabArray
     */
    public TabArray setInactiveSelectedTabBackgroundColor(int color) {
        tabBackgroundColor_selectedInactive = color;
        return this;
    }

    /**
     * Gets background color of the inactive selected tab .
     * (active tab, but temporarily inactive because another tab is clicked and the drawer opened).
     *
     * @return the inactive selected tab background color
     */
    public int getInactiveSelectedTabBackgroundColor() { return tabBackgroundColor_selectedInactive; }

    /**
     * Sets Typeface of the Title
     *
     * @param font Typeface of Title
     * @return the TabArray
     */
    public TabArray setTabTitleFont(Typeface font) {
        tabTitleFont = font;
        return this;
    }

    /**
     * Gets the typeface of Title.
     *
     * @return the typeface of title
     */
    public Typeface getTabTitleFont() { return tabTitleFont; }

    /**
     * Sets title size for all tabs.
     *
     * @param size the size
     * @return the TabArray
     */
    public TabArray setTabTitleSize(int size) {
        tabTitleSize = size;
        return this;
    }

    /**
     * Gets tab title size.
     *
     * @return the tab title size
     */
    public int getTabTitleSize() { return tabTitleSize; }

    /**
     * Sets title color for all tabs.
     *
     * @param color the color
     * @return the TabArray
     */
    public TabArray setTabTitleColor(int color) {
        tabTitleColor = color;
        return this;
    }

    /**
     * Gets tab title color.
     *
     * @return the tab title color
     */
    public int getTabTitleColor() { return tabTitleColor; }

    /**
     * Sets title color for the selected tab.
     *
     * @param color the color
     * @return the TabArray
     */
    public TabArray setSelectedTabTitleColor(int color) {
        tabTitleColor_selected = color;
        return this;
    }

    /**
     * Gets selected tab title color.
     *
     * @return the selected tab title color
     */
    public int getSelectedTabTitleColor() { return tabTitleColor_selected; }

    /**
     * Sets title color of the inactive selected tab .
     * (active tab, but temporarily inactive because another tab is clicked and the drawer opened).
     *
     * @param color the color
     * @return the TabArray
     */
    public TabArray setInactiveSelectedTabTitleColor(int color) {
        tabTitleColor_selectedInactive = color;
        return this;
    }

    /**
     * Gets inactive selected tab title color.
     * (active tab, but temporarily inactive because another tab is clicked and the drawer opened).
     *
     * @return the inactive selected tab title color
     */
    public int getInactiveSelectedTabTitleColor() { return tabTitleColor_selectedInactive; }

    /**
     * Sets tab icon color. (Tint ImageView)
     *
     * @param color the color
     * @return the TabArray
     */
    public TabArray setTabIconColor(int color) {
        tabIconColor = color;
        return this;
    }

    /**
     * Gets tab icon color. (Tint ImageView)
     *
     * @return the tab icon color
     */
    public int getTabIconColor() { return tabIconColor; }

    /**
     * Sets selected tab icon color.
     *
     * @param color the color
     * @return the TabArray
     */
    public TabArray setSelectedTabIconColor(int color) {
        tabIconColor_selected = color;
        return this;
    }

    /**
     * Gets selected tab icon color.
     *
     * @return the selected tab icon color
     */
    public int getSelectedTabIconColor() { return tabIconColor_selected; }

    /**
     * Sets inactive selected tab icon color.
     * (active tab, but temporarily inactive because another tab is clicked and the drawer opened).
     *
     * @param color the color
     * @return the TabArray
     */
    public TabArray setInactiveSelectedTabIconColor(int color) {
        tabIconColor_selectedInactive = color;
        return this;
    }

    /**
     * Gets inactive selected tab icon color.
     * (active tab, but temporarily inactive because another tab is clicked and the drawer opened).
     *
     * @return the inactive selected tab icon color
     */
    public int getInactiveSelectedTabIconColor() { return tabIconColor_selectedInactive; }

    /**
     * Sets if to animate and scale up the icon, when tab is selected
     * Default: true
     *
     * @param scale scale
     * @return the TabArray
     */
    public TabArray setAnimateScaleTabIconWhenSelected(boolean scale) {
        animateScaleTabIconWhenSelected = scale;
        return this;
    }

    /**
     * Gets status of if animate & scale when the tab is selected
     * Default: true
     *
     * @return boolean
     */
    public boolean getAnimateScaleTabIconWhenSelected() { return animateScaleTabIconWhenSelected; }

    /**
     * Sets the scale value of selected tab's icon
     * Default: 1.2f
     *
     * @param value scale value
     * @return TabArray
     */
    public TabArray setTabIconScaleValueWhenSelected(float value) {
        tabIconScaleValueWhenSelected = value;
        return this;
    }

    /**
     * Gets the scale value of selected tab's icon
     * Default: 1.2f
     *
     * @return scale value
     */
    public float getTabIconScaleValueWhenSelected() { return tabIconScaleValueWhenSelected; }

    /**
     * Sets if to make the title bold, when tab is selected
     * Default: true
     *
     * @param bold bold
     * @return the TabArray
     */
    public TabArray setBoldTabTitleWhenSelected(boolean bold) {
        boldTabTitleWhenSelected = bold;
        return this;
    }

    /**
     * Gets status of bold title when the tab is selected
     * Default: true
     *
     * @return boolean
     */
    public boolean getBoldTabTitleWhenSelected() { return boldTabTitleWhenSelected; }


    /**
     * Sets tab item list text color.
     *
     * @param color the color
     * @return the TabArray
     */
    public TabArray setTabListItemTextColor(int color) {
        tabListItemTextColor = color;
        return this;
    }

    /**
     * Sets tab item list text size.
     *
     * @param size the size
     * @return the TabArray
     */
    public TabArray setTabListItemTextSize(int size) {
        tabListItemTextSize = size;
        return this;
    }

}
