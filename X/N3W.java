package X;

import com.facebook.inspiration.model.fonts.InspirationFont;
import com.facebook.inspiration.model.movableoverlay.InspirationAIGeneratedTextInputParams;
import com.facebook.inspiration.model.movableoverlay.InspirationGraphQLTextWithEntities;
import com.facebook.inspiration.model.movableoverlay.InspirationTextParams;
import com.facebook.inspiration.model.movableoverlay.InspirationTextStyle;
import com.facebook.inspiration.model.movableoverlay.SnapbackStrategy;
import com.facebook.inspiration.model.movableoverlay.timedelements.InspirationTimedElementParams;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: N3W.class */
public final class N3W {
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public EnumC3494Mfp A0I;
    public InspirationFont A0J;
    public InspirationAIGeneratedTextInputParams A0K;
    public InspirationGraphQLTextWithEntities A0L;
    public InspirationTextStyle A0M;
    public SnapbackStrategy A0N;
    public InspirationTimedElementParams A0O;
    public PersistableRect A0P;
    public PersistableRect A0Q;
    public ImmutableList A0R;
    public ImmutableList A0S;
    public Float A0T;
    public Float A0U;
    public Float A0V;
    public Float A0W;
    public Integer A0X;
    public Integer A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public Set A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;

    public N3W() {
        this.A0f = AnonymousClass001.A0v();
        this.A0b = "center";
        this.A00 = 1.0d;
        this.A0c = "";
        this.A0j = true;
        this.A0k = true;
        this.A0l = true;
        this.A0m = true;
        this.A0d = "center";
        this.A0R = ImmutableList.of();
        this.A0e = "";
        this.A0S = ImmutableList.of();
    }

    public N3W(InspirationTextParams inspirationTextParams) {
        this.A0f = AnonymousClass001.A0v();
        inspirationTextParams.getClass();
        this.A0K = inspirationTextParams.A0K;
        this.A0T = inspirationTextParams.A0T;
        this.A0U = inspirationTextParams.A0U;
        this.A0V = inspirationTextParams.A0V;
        this.A0W = inspirationTextParams.A0W;
        this.A0Z = inspirationTextParams.A0Z;
        this.A0J = inspirationTextParams.A0J;
        this.A0X = inspirationTextParams.A0X;
        this.A0a = inspirationTextParams.A0a;
        this.A0B = inspirationTextParams.A0B;
        this.A01 = inspirationTextParams.A01;
        this.A0P = inspirationTextParams.A0P;
        this.A0L = inspirationTextParams.A0L;
        this.A0g = inspirationTextParams.A0g;
        this.A0h = inspirationTextParams.A0h;
        this.A0i = inspirationTextParams.A0i;
        this.A02 = inspirationTextParams.A02;
        this.A0Q = inspirationTextParams.A0Q;
        this.A0Y = inspirationTextParams.A0Y;
        this.A0b = inspirationTextParams.A0b;
        this.A03 = inspirationTextParams.A03;
        this.A00 = inspirationTextParams.A00;
        this.A0C = inspirationTextParams.A0C;
        this.A0D = inspirationTextParams.A0D;
        this.A0I = inspirationTextParams.A0I;
        this.A0c = inspirationTextParams.A0c;
        this.A0E = inspirationTextParams.A0E;
        this.A04 = inspirationTextParams.A04;
        this.A05 = inspirationTextParams.A05;
        this.A06 = inspirationTextParams.A06;
        this.A0j = inspirationTextParams.A0j;
        this.A0k = inspirationTextParams.A0k;
        this.A0l = inspirationTextParams.A0l;
        this.A0m = inspirationTextParams.A0m;
        this.A0n = inspirationTextParams.A0n;
        this.A07 = inspirationTextParams.A07;
        this.A0N = inspirationTextParams.A0N;
        this.A0d = inspirationTextParams.A0d;
        this.A0F = inspirationTextParams.A0F;
        this.A0R = inspirationTextParams.A0R;
        this.A08 = inspirationTextParams.A08;
        this.A0M = inspirationTextParams.A0M;
        this.A0H = inspirationTextParams.A0H;
        this.A0O = inspirationTextParams.A0O;
        this.A09 = inspirationTextParams.A09;
        this.A0e = inspirationTextParams.A0e;
        this.A0S = inspirationTextParams.A0S;
        this.A0G = inspirationTextParams.A0G;
        this.A0A = inspirationTextParams.A0A;
        this.A0f = AbF.A1E(inspirationTextParams.A0f);
    }

    public static void A00(N3W n3w, String str) {
        if (n3w.A0f.contains(str)) {
            return;
        }
        HashSet A1E = AbF.A1E(n3w.A0f);
        n3w.A0f = A1E;
        A1E.add(str);
    }

    public void A01(EnumC3494Mfp enumC3494Mfp) {
        this.A0I = enumC3494Mfp;
        C1pq.A08("selectionSource", enumC3494Mfp);
        A00(this, "selectionSource");
    }

    public void A02(InspirationFont inspirationFont) {
        this.A0J = inspirationFont;
        C1pq.A08("font", inspirationFont);
        A00(this, "font");
    }

    public void A03(InspirationGraphQLTextWithEntities inspirationGraphQLTextWithEntities) {
        this.A0L = inspirationGraphQLTextWithEntities;
        C1pq.A08("inspirationTextWithEntities", inspirationGraphQLTextWithEntities);
        A00(this, "inspirationTextWithEntities");
    }

    public void A04(InspirationTextStyle inspirationTextStyle) {
        this.A0M = inspirationTextStyle;
        C1pq.A08("textStyle", inspirationTextStyle);
        A00(this, "textStyle");
    }

    public void A05(PersistableRect persistableRect) {
        this.A0Q = persistableRect;
        C1pq.A08("mediaRect", persistableRect);
        A00(this, "mediaRect");
    }

    public void A06(ImmutableList immutableList) {
        this.A0S = immutableList;
        C1pq.A08("uris", immutableList);
    }

    public void A07(String str) {
        this.A0d = str;
        C1pq.A08("textAlign", str);
    }
}
