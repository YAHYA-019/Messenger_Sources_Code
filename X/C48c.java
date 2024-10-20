package X;

import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.MontageUser;
import com.facebook.messaging.montage.model.montageattribution.MontageAttributionData;
import com.facebook.messaging.montage.model.montagemetadata.MontageMetadata;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.48c, reason: invalid class name */
/* loaded from: 48c.class */
public final class C48c {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public ContentAppAttribution A05;
    public Message A06;
    public 48J A07;
    public MontageUser A08;
    public MontageAttributionData A09;
    public MontageMetadata A0A;
    public ImmutableList A0B;
    public ImmutableList A0C;
    public ImmutableList A0D;
    public ImmutableList A0E;
    public ImmutableMap A0F;
    public 1Mu A0G;
    public Long A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;

    public C48c() {
    }

    public C48c(MontageCard montageCard) {
        this.A07 = montageCard.A07;
        this.A0P = montageCard.A0L;
        this.A06 = montageCard.A06;
        this.A08 = montageCard.A08;
        this.A02 = montageCard.A03;
        this.A0I = montageCard.A0E;
        this.A04 = montageCard.A05;
        this.A0G = montageCard.A04();
        this.A0L = montageCard.A0H;
        this.A0K = montageCard.A0G;
        this.A0D = montageCard.A03();
        this.A0A = montageCard.A0A;
        this.A09 = montageCard.A09;
        this.A0B = montageCard.A01();
        this.A0C = montageCard.A02();
        this.A0M = montageCard.A0I;
        this.A0J = montageCard.A0F;
        this.A0O = montageCard.A0K;
        this.A01 = montageCard.A02;
        this.A0H = montageCard.A0D;
        this.A0N = montageCard.A0J;
        this.A05 = montageCard.A00;
        this.A03 = montageCard.A04;
        boolean z = montageCard.A0M;
        this.A0E = z ? montageCard.A0B : ImmutableList.of();
        this.A0Q = z;
        this.A0R = montageCard.A0N;
        this.A0F = montageCard.A0C;
    }

    public MontageCard A00() {
        48J r0 = this.A07;
        Message message = this.A06;
        MontageUser montageUser = this.A08;
        long j = this.A02;
        String str = this.A0I;
        long j2 = this.A04;
        1Mu r02 = this.A0G;
        String str2 = this.A0L;
        String str3 = this.A0K;
        ImmutableList immutableList = this.A0D;
        MontageMetadata montageMetadata = this.A0A;
        MontageAttributionData montageAttributionData = this.A09;
        ImmutableList immutableList2 = this.A0B;
        ImmutableList immutableList3 = this.A0C;
        String str4 = this.A0M;
        String str5 = this.A0J;
        String str6 = this.A0O;
        int i = this.A01;
        Long l = this.A0H;
        String str7 = this.A0N;
        ContentAppAttribution contentAppAttribution = this.A05;
        long j3 = this.A03;
        boolean z = this.A0R;
        boolean z2 = this.A0Q;
        return new MontageCard(contentAppAttribution, message, r0, montageUser, montageAttributionData, montageMetadata, immutableList, immutableList2, immutableList3, this.A0E, this.A0F, r02, l, str, str2, str3, str4, str5, str6, str7, i, this.A00, j, j2, j3, z, z2, this.A0P, false);
    }
}
