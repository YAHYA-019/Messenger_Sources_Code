package X;

import android.content.res.XmlResourceParser;
import java.util.ArrayList;

/* loaded from: KyB.class */
public abstract class KyB {
    public static final Object A00 = AnonymousClass001.A0R();
    public static volatile ArrayList A01;

    public static String A00(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue(AnonymousClass000.A00(58), str);
        if (attributeValue == null) {
            attributeValue = xmlResourceParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }
}
