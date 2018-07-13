package com.alicannklc.laravel.snippets;

/**
 * @author Alicannklc
 */

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

public class LaravelTemplateProvider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {
        return new String[]{
                "liveTemplates/Laravel-Blade",
                "liveTemplates/Laravel-Cache",
                "liveTemplates/Laravel-Form",
                "liveTemplates/Laravel-Helpers",
                "liveTemplates/Laravel-Requests-and-Input",
                "liveTemplates/Laravel-Routes",
                "liveTemplates/Laravel-Schema",
                "liveTemplates/Laravel-Session",
                "liveTemplates/Laravel-Views-and-Responses",
                "liveTemplates/Laravel-5snippets",
        };
    }

    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return null;
    }
}