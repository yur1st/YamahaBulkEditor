package com.editor.service;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class XmlStringNoTrimAdapter extends XmlAdapter<String, String> {
    @Override
    public String unmarshal(String v) {
        if (v == null)
            return null;
        return v;
    }

    @Override
    public String marshal(String v) {
        if (v == null)
            return null;
        return v;
    }
}

