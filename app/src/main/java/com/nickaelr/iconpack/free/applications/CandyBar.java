package com.nickaelr.iconpack.free.applications;

import android.support.annotation.NonNull;

import com.dm.material.dashboard.candybar.applications.CandyBarApplication;

public class CandyBar extends CandyBarApplication {
    
    @NonNull
    @Override
    public Configuration onInit() {
        //Sample configuration
        Configuration configuration = new Configuration();

        configuration.setGenerateAppFilter(true);
        configuration.setGenerateAppMap(true);
        configuration.setGenerateThemeResources(true);
        configuration.setHomeGridStyle(GridStyle.FLAT);
        configuration.setHighQualityPreviewEnabled(true);
        configuration.setAboutStyle(Style.PORTRAIT_FLAT_LANDSCAPE_FLAT);
        configuration.setNavigationViewHeaderStyle(NavigationViewHeader.NONE);
        configuration.setDashboardThemingEnabled(true);

        return configuration;
    }
}
