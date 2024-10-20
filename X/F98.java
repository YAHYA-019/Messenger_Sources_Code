package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.zero.sdk.json.JSONObjectImpl;
import java.io.IOException;

/* loaded from: F98.class */
public final class F98 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public F98(String str, long j, String str2, String str3, String str4, String str5) {
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = str4;
        this.A02 = str;
        this.A00 = j;
        this.A03 = str5;
    }

    public static F98 A00(JSONObjectImpl jSONObjectImpl) {
        String str;
        try {
            str = jSONObjectImpl.A05("logo_url");
        } catch (IOException unused) {
            str = "";
        }
        return new F98(jSONObjectImpl.A05("key"), jSONObjectImpl.A04("cooldown_in_sec").longValue(), jSONObjectImpl.A05("text"), jSONObjectImpl.A05("subtext"), jSONObjectImpl.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), str);
    }

    public JSONObjectImpl A01() {
        Ezt ezt = new Ezt();
        ezt.A05("key", this.A02);
        ezt.A05("text", this.A05);
        ezt.A05("subtext", this.A04);
        ezt.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.A01);
        ezt.A04("cooldown_in_sec", Long.valueOf(this.A00));
        String str = this.A03;
        if (str != null) {
            ezt.A05("logo_url", str);
        }
        return ezt.A00();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof F98) {
                F98 f98 = (F98) obj;
                if (this.A05.equals(f98.A05) && this.A04.equals(f98.A04) && this.A01.equals(f98.A01) && this.A02.equals(f98.A02) && this.A03.equals(f98.A03) && this.A00 == f98.A00) {
                    z = true;
                }
            }
        }
        return z;
    }
}
