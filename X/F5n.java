package X;

import com.facebook.inspiration.smarteditor.api.model.SmartEditData;
import com.google.common.collect.ImmutableList;

/* loaded from: F5n.class */
public final class F5n {
    public ImmutableList A00;
    public ImmutableList A01;
    public String A02;
    public boolean A03;

    public F5n() {
        this.A01 = ImmutableList.of();
        this.A02 = "";
    }

    public F5n(SmartEditData smartEditData) {
        this.A00 = smartEditData.A00;
        this.A01 = smartEditData.A01;
        this.A03 = smartEditData.A03;
        this.A02 = smartEditData.A02;
    }
}
