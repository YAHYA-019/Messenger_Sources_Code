package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashSet;

/* loaded from: Lyd.class */
public final class Lyd extends HashSet {
    public final int A00;

    public Lyd(int i) {
        Object obj;
        this.A00 = i;
        switch (i) {
            case 0:
                add("street-address");
                add("address-line1");
                add("address-line2");
                add("address-line3");
                add("address-level1");
                add("address-level2");
                add("address-level3");
                add("address-level4");
                add("country");
                add("country-name");
                obj = "postal-code";
                break;
            case 1:
                obj = "email";
                break;
            case 2:
                add(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                add("given-name");
                obj = "family-name";
                break;
            default:
                add("tel");
                add("tel-country-code");
                add("tel-national");
                add("tel-area-code");
                add("tel-local");
                add("tel-local-prefix");
                obj = "tel-local-suffix";
                break;
        }
        add(obj);
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
                if (obj instanceof String) {
                    return super.contains(obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
                if (obj instanceof String) {
                    return super.remove(obj);
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
                return super.size();
            default:
                return super.size();
        }
    }
}
