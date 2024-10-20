package X;

import android.net.Uri;
import android.provider.MediaStore;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.6wb, reason: invalid class name */
/* loaded from: 6wb.class */
public final class C6wb implements C6wc {
    public static final C6wb A00 = new Object();
    public static final String[] A01 = {"_data", "date_modified", "date_added", "media_type", Property.ICON_TEXT_FIT_WIDTH, Property.ICON_TEXT_FIT_HEIGHT, "mime_type", "_size", "duration", "orientation"};

    @Override // X.C6wc
    public String Aa6() {
        return AbE.A00(127);
    }

    @Override // X.C6wc
    public String AgR() {
        return "_data";
    }

    @Override // X.C6wc
    public String Aga() {
        return "date_modified";
    }

    @Override // X.C6wc
    public String AiU() {
        return "duration";
    }

    @Override // X.C6wc
    public String AmQ() {
        return "_size";
    }

    @Override // X.C6wc
    public String Aow() {
        return Property.ICON_TEXT_FIT_HEIGHT;
    }

    @Override // X.C6wc
    public String Axi() {
        return "mime_type";
    }

    @Override // X.C6wc
    public String B0Z() {
        return "orientation";
    }

    @Override // X.C6wc
    public String[] B5G() {
        return A01;
    }

    @Override // X.C6wc
    public Uri B5g() {
        Uri contentUri = MediaStore.Files.getContentUri("external");
        11T.A0A(contentUri);
        return contentUri;
    }

    @Override // X.C6wc
    public String B9p() {
        return "media_type=1 OR media_type=3";
    }

    @Override // X.C6wc
    public String BBc() {
        return "date_added DESC, date_modified DESC, _data DESC";
    }

    @Override // X.C6wc
    public String BKj() {
        return Property.ICON_TEXT_FIT_WIDTH;
    }
}
