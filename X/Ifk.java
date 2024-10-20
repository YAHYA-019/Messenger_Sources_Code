package X;

import com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel;

/* loaded from: Ifk.class */
public final class Ifk implements JLN {
    public final /* synthetic */ CowatchMediaInfoModel A00;

    public Ifk(CowatchMediaInfoModel cowatchMediaInfoModel) {
        this.A00 = cowatchMediaInfoModel;
    }

    public String AeG() {
        String str = this.A00.mediaID;
        if (str == null) {
            str = "";
        }
        return str;
    }

    public Integer AeJ() {
        return HIm.A00(this.A00.mediaSource);
    }

    public boolean BTL() {
        return 4YV.A1U(this.A00.mediaType);
    }

    public boolean BXH() {
        return AnonymousClass001.A1Q(this.A00.mediaType, 2);
    }
}
