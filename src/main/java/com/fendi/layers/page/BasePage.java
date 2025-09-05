package com.fendi.layers.page;


import com.fendi.helper.AlertHelper;
import com.fendi.layers.manager.ElementManager;

public abstract class BasePage <T extends BasePage> {
    public abstract T waitForPageLoaded();
    protected final ElementManager elementManager = new ElementManager();
    protected final AlertHelper alertHelper = new AlertHelper();
}