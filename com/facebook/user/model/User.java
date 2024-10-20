package com.facebook.user.model;

import X.0S2;
import X.1BK;
import X.1JF;
import X.1Js;
import X.1Kh;
import X.1Kn;
import X.1Kq;
import X.1Ks;
import X.1LE;
import X.1M1;
import X.1MA;
import X.1uP;
import X.3HF;
import X.3HG;
import X.3oC;
import X.3oD;
import X.AbE;
import X.AnonymousClass001;
import X.BLW;
import X.C1L9;
import X.C1z1;
import X.C2xc;
import X.C3P4;
import X.C53v;
import X.CBP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.TriState;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.business.messengerextensions.model.MessengerExtensionProperties;
import com.facebook.messaging.games.model.InstantGameChannel;
import com.facebook.user.profilepic.PicSquare;
import com.facebook.user.profilepic.PicSquareUrlWithSize;
import com.facebook.user.profilepic.ProfilePicUriWithFilePath;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: User.class */
public class User implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(54);
    public long A00;
    public ImmutableList A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final long A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final long A0M;
    public final long A0N;
    public final long A0O;
    public final long A0P;
    public final long A0Q;
    public final long A0R;
    public final TriState A0S;
    public final TriState A0T;
    public final 1Kq A0U;
    public final MessengerExtensionProperties A0V;
    public final InstantGameChannel A0W;
    public final Name A0X;
    public final NeoUserStatusSetting A0Y;
    public final 3oD A0Z;
    public final 1Kn A0a;
    public final 3oC A0b;
    public final 1LE A0c;
    public final 1M1 A0d;
    public final 1Js A0e;
    public final User A0f;
    public final User A0g;
    public final 1MA A0h;
    public final UserIdentifier A0i;
    public final UserIdentifier A0j;
    public final UserKey A0k;
    public final UserLightWeightStatus A0l;
    public final WorkUserForeignEntityInfo A0m;
    public final WorkUserInfo A0n;
    public final Capabilities A0o;
    public final 1Ks A0p;
    public final ImmutableList A0q;
    public final ImmutableList A0r;
    public final ImmutableList A0s;
    public final ImmutableList A0t;
    public final ImmutableList A0u;
    public final ImmutableList A0v;
    public final Integer A0w;
    public final Integer A0x;
    public final Integer A0y;
    public final Integer A0z;
    public final String A10;
    public final String A11;
    public final String A12;
    public final String A13;
    public final String A14;
    public final String A15;
    public final String A16;
    public final String A17;
    public final String A18;
    public final String A19;
    public final String A1A;
    public final String A1B;
    public final String A1C;
    public final String A1D;
    public final String A1E;
    public final String A1F;
    public final String A1G;
    public final String A1H;
    public final String A1I;
    public final String A1J;
    public final String A1K;
    public final String A1L;
    public final String A1M;
    public final String A1N;
    public final String A1O;
    public final String A1P;
    public final String A1Q;
    public final String A1R;
    public final String A1S;
    public final String A1T;
    public final String A1U;
    public final String A1V;
    public final String A1W;
    public final boolean A1X;
    public final boolean A1Y;
    public final boolean A1Z;
    public final boolean A1a;
    public final boolean A1b;
    public final boolean A1c;
    public final boolean A1d;
    public final boolean A1e;
    public final boolean A1f;
    public final boolean A1g;
    public final boolean A1h;
    public final boolean A1i;
    public final boolean A1j;
    public final boolean A1k;
    public final boolean A1l;
    public final boolean A1m;
    public final boolean A1n;
    public final boolean A1o;
    public final boolean A1p;
    public final boolean A1q;
    public final boolean A1r;
    public final boolean A1s;
    public final boolean A1t;
    public final boolean A1u;
    public final boolean A1v;
    public final boolean A1w;
    public final boolean A1x;
    public final boolean A1y;
    public final boolean A1z;
    public final boolean A20;
    public final boolean A21;
    public final boolean A22;
    public final boolean A23;
    public final boolean A24;
    public final boolean A25;
    public final boolean A26;
    public final boolean A27;
    public final boolean A28;
    public final boolean A29;
    public final boolean A2A;
    public final boolean A2B;
    public final boolean A2C;
    public final boolean A2D;
    public final boolean A2E;
    public final boolean A2F;
    public final Name A2G;
    public final ImmutableList A2H;
    public final ImmutableList A2I;
    public final String A2J;
    public final String A2K;
    public final boolean A2L;
    public final boolean A2M;
    public volatile PicSquare A2N;
    public volatile ProfilePicUriWithFilePath A2O;
    public volatile String A2P;

    public User(1Kh r302) {
        String str = r302.A0v;
        Preconditions.checkNotNull(str, "id must not be null");
        this.A13 = str;
        1Js r0 = r302.A0Z;
        Preconditions.checkNotNull(r0, "type must not be null");
        this.A0e = r0;
        this.A0k = new UserKey(r0, str);
        this.A1T = r302.A1S;
        this.A0R = r302.A0L;
        List list = r302.A1V;
        this.A0r = list == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) list);
        ImmutableList immutableList = r302.A0n;
        this.A0v = immutableList == null ? ImmutableList.of() : immutableList;
        List list2 = r302.A1W;
        this.A01 = list2 == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) list2);
        ImmutableList immutableList2 = r302.A0k;
        this.A0s = immutableList2 == null ? ImmutableList.of() : immutableList2;
        ImmutableList immutableList3 = r302.A0l;
        this.A0t = immutableList3 == null ? ImmutableList.of() : immutableList3;
        Name name = r302.A0R;
        this.A0X = name == null ? new Name(r302.A0u, r302.A0w, r302.A0t) : name;
        this.A2G = r302.A0S;
        this.A1N = r302.A1L;
        this.A0C = r302.A02;
        this.A2K = r302.A1R;
        this.A1R = r302.A1Q;
        this.A11 = r302.A0s;
        this.A2N = r302.A0g;
        this.A2O = r302.A0h;
        this.A1Q = r302.A1O;
        this.A08 = r302.A01;
        this.A0S = r302.A0M;
        this.A1a = r302.A1Z;
        this.A1g = r302.A1b;
        this.A1W = r302.A1U;
        this.A1U = r302.A1T;
        this.A1P = r302.A1N;
        this.A1e = r302.A1a;
        this.A1Y = r302.A1X;
        this.A1Z = r302.A1Y;
        this.A0w = r302.A0o;
        this.A0q = r302.A0j;
        this.A0Q = r302.A0I;
        this.A0I = r302.A0B;
        this.A1c = r302.A1w;
        this.A1b = r302.A1v;
        this.A0a = r302.A0V;
        this.A1d = r302.A29;
        this.A1f = r302.A2G;
        this.A0i = A00();
        long j = this.A0R;
        this.A0j = j > 0 ? new UserMsysPkIdentifier(j) : A00();
        this.A0B = r302.A06;
        this.A0A = r302.A05;
        this.A09 = r302.A04;
        this.A10 = r302.A11;
        this.A1V = r302.A1I;
        this.A1S = r302.A1G;
        this.A12 = r302.A15;
        this.A29 = r302.A2E;
        this.A2D = r302.A2J;
        this.A28 = r302.A2D;
        this.A0T = r302.A0N;
        this.A1m = r302.A1i;
        this.A1q = r302.A1n;
        this.A23 = r302.A27;
        this.A0N = r302.A0H;
        this.A0J = r302.A0C;
        this.A1h = r302.A1c;
        this.A00 = r302.A0G;
        this.A0O = r302.A0J;
        this.A1X = r302.A1o;
        this.A1u = r302.A1s;
        this.A02 = r302.A1P;
        this.A2P = r302.A1H;
        this.A07 = r302.A00;
        this.A26 = r302.A2B;
        this.A1i = r302.A1d;
        this.A25 = r302.A2A;
        this.A1j = r302.A1e;
        this.A0c = r302.A0X;
        this.A2E = r302.A2K;
        this.A1l = r302.A1h;
        this.A1k = r302.A1g;
        this.A0V = r302.A0P;
        this.A0g = r302.A0b;
        this.A0x = r302.A0p;
        this.A0z = r302.A0r;
        this.A0f = r302.A0a;
        this.A22 = r302.A26;
        this.A0u = r302.A0m;
        this.A18 = r302.A12;
        this.A0W = r302.A0Q;
        this.A0E = r302.A07;
        this.A1H = r302.A1C;
        this.A1n = r302.A1k;
        this.A27 = r302.A2C;
        this.A24 = r302.A28;
        this.A1s = r302.A1q;
        this.A2B = r302.A2H;
        this.A2L = r302.A1f;
        this.A2M = r302.A1t;
        this.A0P = r302.A0K;
        this.A1D = r302.A18;
        this.A0n = r302.A0f;
        this.A0m = r302.A0e;
        this.A1z = r302.A22;
        this.A1y = r302.A21;
        this.A2J = "NA";
        this.A2H = ImmutableList.of();
        this.A2I = ImmutableList.of();
        this.A2C = r302.A2I;
        this.A1B = r302.A16;
        this.A14 = r302.A0x;
        this.A1J = r302.A1E;
        Integer num = r302.A0q;
        this.A0y = num == null ? 0S2.A00 : num;
        this.A21 = r302.A25;
        this.A16 = r302.A0z;
        this.A1o = r302.A1l;
        this.A17 = r302.A10;
        this.A0G = r302.A09;
        this.A0U = r302.A0O;
        this.A1t = r302.A1r;
        this.A1r = r302.A1p;
        this.A0D = r302.A03;
        this.A1v = r302.A1u;
        this.A0F = r302.A08;
        this.A0H = r302.A0A;
        this.A0Y = r302.A0T;
        this.A0l = r302.A0d;
        this.A1p = r302.A1m;
        this.A1K = r302.A1F;
        this.A2A = r302.A2F;
        this.A20 = r302.A23;
        this.A0p = r302.A0i;
        this.A0d = r302.A0Y;
        this.A2F = r302.A2L;
        long j2 = r302.A0D;
        this.A0K = j2;
        long j3 = r302.A0E;
        this.A0L = j3;
        this.A0o = Capabilities.A01.A03(new long[]{j2, j3});
        this.A1w = r302.A1z;
        this.A1x = r302.A20;
        this.A1I = r302.A1D;
        this.A1O = r302.A1M;
        this.A0M = r302.A0F;
        this.A19 = r302.A13;
        this.A0h = r302.A0c;
        this.A1E = r302.A19;
        this.A1F = r302.A1A;
        this.A15 = r302.A0y;
        this.A1C = r302.A17;
        this.A06 = r302.A1x;
        this.A04 = r302.A1y;
        this.A1G = r302.A1B;
        this.A03 = r302.A1j;
        this.A05 = r302.A24;
        this.A1M = r302.A1K;
        this.A0b = r302.A0W;
        this.A0Z = r302.A0U;
        this.A1A = r302.A14;
        this.A1L = r302.A1J;
    }

    public User(Parcel parcel) {
        1Kn r306;
        1LE r3062;
        1M1 r3063;
        3oC r321;
        String readString = parcel.readString();
        this.A13 = readString;
        1Js valueOf = 1Js.valueOf(parcel.readString());
        this.A0e = valueOf;
        this.A0k = new UserKey(valueOf, readString);
        this.A1T = parcel.readString();
        this.A0R = parcel.readLong();
        this.A0r = ImmutableList.copyOf((Collection) parcel.readArrayList(UserEmailAddress.class.getClassLoader()));
        this.A0v = ImmutableList.copyOf((Collection) parcel.readArrayList(ManagingParent.class.getClassLoader()));
        this.A01 = ImmutableList.copyOf((Collection) parcel.readArrayList(UserPhoneNumber.class.getClassLoader()));
        this.A0X = (Name) parcel.readParcelable(Name.class.getClassLoader());
        this.A2G = (Name) parcel.readParcelable(Name.class.getClassLoader());
        this.A1N = parcel.readString();
        this.A0C = C1L9.A00(parcel.readString());
        this.A2K = parcel.readString();
        this.A1R = parcel.readString();
        this.A11 = parcel.readString();
        this.A2N = (PicSquare) parcel.readParcelable(PicSquare.class.getClassLoader());
        this.A2O = (ProfilePicUriWithFilePath) parcel.readParcelable(ProfilePicUriWithFilePath.class.getClassLoader());
        parcel.readString();
        this.A1Q = parcel.readString();
        this.A08 = parcel.readFloat();
        this.A0S = TriState.valueOf(parcel.readString());
        this.A1a = parcel.readInt() != 0;
        this.A1g = parcel.readInt() != 0;
        this.A1W = parcel.readString();
        this.A1U = parcel.readString();
        this.A1P = parcel.readString();
        this.A1e = parcel.readInt() != 0;
        this.A0Q = parcel.readLong();
        this.A0I = parcel.readLong();
        this.A1c = parcel.readInt() != 0;
        this.A1b = parcel.readInt() != 0;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            r306 = 1Kn.A06;
        } else {
            try {
                r306 = 1Kn.valueOf(readString2);
            } catch (IllegalArgumentException unused) {
                r306 = 1Kn.A06;
            }
        }
        this.A0a = r306;
        this.A1d = parcel.readInt() != 0;
        this.A1f = parcel.readInt() != 0;
        this.A0B = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A10 = parcel.readString();
        this.A1S = parcel.readString();
        this.A1V = parcel.readString();
        this.A12 = parcel.readString();
        this.A0i = A00();
        long j = this.A0R;
        this.A0j = j > 0 ? new UserMsysPkIdentifier(j) : A00();
        this.A29 = parcel.readInt() != 0;
        this.A2D = parcel.readInt() != 0;
        this.A28 = parcel.readInt() != 0;
        this.A0T = TriState.fromDbValue(parcel.readInt());
        this.A1m = parcel.readInt() != 0;
        this.A1Y = parcel.readInt() != 0;
        this.A1Z = parcel.readInt() != 0;
        this.A1q = parcel.readInt() != 0;
        this.A23 = parcel.readInt() != 0;
        parcel.readInt();
        String readString3 = parcel.readString();
        Integer num = null;
        if (readString3 != null) {
            try {
                num = CBP.A00(readString3);
            } catch (IllegalArgumentException unused2) {
            }
        }
        this.A0w = num;
        this.A1h = parcel.readInt() != 0;
        ArrayList readArrayList = parcel.readArrayList(BLW.class.getClassLoader());
        ImmutableList immutableList = null;
        this.A0q = readArrayList == null ? null : ImmutableList.copyOf((Collection) readArrayList);
        this.A00 = parcel.readLong();
        this.A0O = parcel.readLong();
        parcel.readInt();
        this.A1X = parcel.readInt() != 0;
        this.A1u = parcel.readInt() != 0;
        this.A02 = parcel.readString();
        this.A2P = parcel.readString();
        this.A07 = parcel.readFloat();
        parcel.readArrayList(CallToAction.class.getClassLoader());
        this.A26 = parcel.readInt() != 0;
        this.A1i = parcel.readInt() != 0;
        this.A25 = parcel.readInt() != 0;
        this.A1j = parcel.readInt() != 0;
        try {
            r3062 = 1LE.valueOf(parcel.readString());
        } catch (IllegalArgumentException | NullPointerException unused3) {
            r3062 = null;
        }
        this.A0c = r3062;
        this.A2E = parcel.readInt() != 0;
        this.A1l = parcel.readInt() != 0;
        this.A1k = parcel.readInt() != 0;
        parcel.readInt();
        this.A0V = (MessengerExtensionProperties) parcel.readParcelable(MessengerExtensionProperties.class.getClassLoader());
        this.A0g = (User) parcel.readParcelable(User.class.getClassLoader());
        this.A0x = C3P4.A00(parcel.readString());
        this.A0z = 3HF.A00(parcel.readString());
        this.A0f = (User) parcel.readParcelable(User.class.getClassLoader());
        this.A22 = parcel.readInt() != 0;
        parcel.readString();
        ArrayList readArrayList2 = parcel.readArrayList(CallToAction.class.getClassLoader());
        this.A0u = readArrayList2 == null ? null : ImmutableList.copyOf((Collection) readArrayList2);
        this.A18 = parcel.readString();
        this.A0W = (InstantGameChannel) parcel.readParcelable(InstantGameChannel.class.getClassLoader());
        this.A0E = parcel.readInt();
        this.A1H = parcel.readString();
        parcel.readString();
        this.A1n = parcel.readInt() != 0;
        ArrayList readArrayList3 = parcel.readArrayList(AlohaUser.class.getClassLoader());
        this.A0s = readArrayList3 == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) readArrayList3);
        this.A27 = parcel.readInt() != 0;
        this.A24 = parcel.readInt() != 0;
        this.A0t = ImmutableList.copyOf((Collection) parcel.readArrayList(AlohaProxyUser.class.getClassLoader()));
        parcel.readInt();
        this.A1s = parcel.readInt() != 0;
        parcel.readArrayList(String.class.getClassLoader());
        this.A2B = parcel.readInt() != 0;
        this.A2L = parcel.readInt() != 0;
        this.A2M = parcel.readInt() != 0;
        this.A0P = parcel.readLong();
        this.A1D = parcel.readString();
        this.A0n = (WorkUserInfo) parcel.readParcelable(WorkUserInfo.class.getClassLoader());
        this.A0m = (WorkUserForeignEntityInfo) parcel.readParcelable(WorkUserForeignEntityInfo.class.getClassLoader());
        this.A2J = parcel.readString();
        ArrayList readArrayList4 = parcel.readArrayList(String.class.getClassLoader());
        this.A2H = readArrayList4 == null ? null : ImmutableList.copyOf((Collection) readArrayList4);
        ArrayList readArrayList5 = parcel.readArrayList(String.class.getClassLoader());
        this.A2I = readArrayList5 != null ? ImmutableList.copyOf((Collection) readArrayList5) : immutableList;
        this.A2C = C53v.A0S(parcel);
        this.A1B = parcel.readString();
        this.A14 = parcel.readString();
        this.A1J = parcel.readString();
        this.A0y = 3HG.A00(parcel.readString());
        this.A21 = C53v.A0S(parcel);
        this.A16 = parcel.readString();
        this.A1o = C53v.A0S(parcel);
        this.A17 = parcel.readString();
        this.A0G = parcel.readInt();
        String readString4 = parcel.readString();
        this.A0U = readString4 == null ? 1Kq.A0D : 1Kq.valueOf(readString4);
        this.A1t = C53v.A0S(parcel);
        this.A1r = C53v.A0S(parcel);
        this.A0D = parcel.readInt();
        this.A1v = C53v.A0S(parcel);
        this.A0F = parcel.readInt();
        this.A0H = parcel.readInt();
        this.A0Y = (NeoUserStatusSetting) parcel.readParcelable(NeoUserStatusSetting.class.getClassLoader());
        this.A1p = parcel.readInt() != 0;
        this.A1K = parcel.readString();
        this.A2A = C53v.A0S(parcel);
        this.A1z = parcel.readInt() != 0;
        this.A1y = parcel.readInt() != 0;
        this.A20 = C53v.A0S(parcel);
        this.A0p = 1uP.A00(C53v.A08(parcel));
        try {
            r3063 = 1M1.valueOf(parcel.readString());
        } catch (IllegalArgumentException | NullPointerException unused4) {
            r3063 = null;
        }
        this.A0d = r3063;
        this.A2F = C53v.A0S(parcel);
        this.A0N = parcel.readLong();
        this.A0J = parcel.readLong();
        long readLong = parcel.readLong();
        this.A0K = readLong;
        long readLong2 = parcel.readLong();
        this.A0L = readLong2;
        this.A0o = Capabilities.A01.A03(new long[]{readLong, readLong2});
        this.A1w = C53v.A0S(parcel);
        this.A1x = C53v.A0S(parcel);
        this.A1I = parcel.readString();
        this.A1O = parcel.readString();
        this.A0l = (UserLightWeightStatus) parcel.readParcelable(UserLightWeightStatus.class.getClassLoader());
        this.A0M = parcel.readLong();
        this.A19 = parcel.readString();
        this.A0h = C53v.A07(parcel, 1MA.class);
        this.A1E = parcel.readString();
        this.A1F = parcel.readString();
        this.A15 = parcel.readString();
        this.A1C = parcel.readString();
        this.A06 = C53v.A0S(parcel);
        this.A04 = C53v.A0S(parcel);
        this.A1G = parcel.readString();
        this.A03 = C53v.A0S(parcel);
        this.A05 = C53v.A0S(parcel);
        this.A1M = parcel.readString();
        Integer A08 = C53v.A08(parcel);
        if (A08 != null) {
            3oC[] values = 3oC.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    r321 = 3oC.A02;
                    break;
                }
                r321 = values[i];
                Integer num2 = r321.mValue;
                if (num2 != null && num2.equals(A08)) {
                    break;
                } else {
                    i++;
                }
            }
        } else {
            r321 = null;
        }
        this.A0b = r321;
        this.A0Z = 3oD.A00(C53v.A08(parcel));
        this.A1A = parcel.readString();
        this.A1L = parcel.readString();
    }

    private UserIdentifier A00() {
        UserPhoneNumber A03;
        1Js r0 = this.A0e;
        if (r0 == 1Js.A03) {
            return new UserFbidIdentifier(this.A13);
        }
        if (A01(r0)) {
            A03 = A03();
            String A08 = A08();
            if (A03 == null) {
                if (A08 != null) {
                    return new UserSmsIdentifier(A08);
                }
                return null;
            }
        } else {
            if (r0 != 1Js.A08) {
                return null;
            }
            A03 = A03();
            if (A03 == null) {
                return null;
            }
        }
        return new UserSmsIdentifier(A03.A03, A03.A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r301 == X.1Js.A06) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.1Js r301) {
        /*
            X.1Js r0 = X.1Js.A01
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L28
            X.1Js r0 = X.1Js.A07
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L28
            X.1Js r0 = X.1Js.A02
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L28
            X.1Js r0 = X.1Js.A06
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L2a
        L28:
            r0 = 1
            r304 = r0
        L2a:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.model.User.A01(X.1Js):boolean");
    }

    public C1z1 A02() {
        return (A0E() || !this.A1q) ? this.A23 ? C1z1.BLOCKED_ON_MESSENGER : C1z1.NOT_BLOCKED : C1z1.FULLY_BLOCKED;
    }

    public UserPhoneNumber A03() {
        if (this.A01.isEmpty()) {
            return null;
        }
        return (UserPhoneNumber) this.A01.get(0);
    }

    public PicSquare A04() {
        if (this.A2N == null) {
            synchronized (this) {
                if (this.A2N == null) {
                    PicSquare picSquare = null;
                    if (!1JF.A0B(this.A2P)) {
                        try {
                            JSONArray jSONArray = new JSONArray(this.A2P);
                            ImmutableList.Builder builder = ImmutableList.builder();
                            int length = jSONArray.length();
                            for (int i = 0; i < length; i++) {
                                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                                builder.m11011add((Object) new PicSquareUrlWithSize(optJSONObject.optInt("profile_pic_size"), optJSONObject.optString("profile_pic_url")));
                            }
                            new PicSquare(builder.build());
                        } catch (JSONException unused) {
                        }
                    }
                    this.A2N = picSquare;
                }
            }
        }
        return this.A2N;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, boolean] */
    public ImmutableList A05() {
        ?? A0B;
        ImmutableList immutableList = this.A01;
        if ((immutableList == null || immutableList.isEmpty()) && (A0B = 1JF.A0B(this.A02)) == 0) {
            try {
                JSONArray jSONArray = new JSONArray(this.A02);
                ImmutableList.Builder builder = ImmutableList.builder();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    String optString = optJSONObject.optString("phone_full_number");
                    builder.m11011add((Object) new UserPhoneNumber(optJSONObject.has("phone_is_verified") ? TriState.valueOf(optJSONObject.optBoolean("phone_is_verified")) : TriState.UNSET, optJSONObject.optString("phone_display_number"), optString, optString, optJSONObject.optInt("phone_android_type")));
                }
                ImmutableList build = builder.build();
                if (build != null) {
                    this.A01 = build;
                }
            } catch (JSONException unused) {
                throw AnonymousClass001.A0U(A0B);
            }
        }
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 == null) {
            immutableList2 = ImmutableList.of();
            this.A01 = immutableList2;
        }
        return immutableList2;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable, com.facebook.user.model.UserPhoneNumber] */
    public String A06() {
        String str = this.A02;
        if (str == null) {
            if (this.A01 == null) {
                str = null;
            } else {
                JSONArray jSONArray = new JSONArray();
                int size = this.A01.size();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= size) {
                        break;
                    }
                    ?? r0 = (UserPhoneNumber) this.A01.get(i2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("phone_full_number", r0.A03);
                        jSONObject.put("phone_display_number", r0.A02);
                        TriState triState = r0.A01;
                        if (triState != TriState.UNSET) {
                            jSONObject.put("phone_is_verified", triState.asBoolean(false));
                        }
                        jSONObject.put("phone_android_type", r0.A00);
                        jSONArray.put(jSONObject);
                        i = i2 + 1;
                    } catch (JSONException unused) {
                        throw AnonymousClass001.A0U(r0);
                    }
                }
                str = jSONArray.toString();
            }
            this.A02 = str;
        }
        return str;
    }

    public String A07() {
        String str = this.A2K;
        if (str == null) {
            if (this.A2N == null) {
                return null;
            }
            str = ((PicSquareUrlWithSize) this.A2N.mPicSquareUrlsWithSizes.get(0)).url;
        }
        return str;
    }

    public String A08() {
        ImmutableList immutableList = this.A0r;
        if (immutableList.isEmpty()) {
            return null;
        }
        return ((UserEmailAddress) 1BK.A0r(immutableList)).A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r301.A0o.A00.get(76) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A09() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A2L
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1c
            r0 = r301
            com.facebook.xapp.messaging.capability.vector.Capabilities r0 = r0.A0o
            java.util.BitSet r0 = r0.A00
            r1 = 76
            boolean r0 = r0.get(r1)
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            r302 = r0
        L1e:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.model.User.A09():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r301.A0o.A00.get(83) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0A() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A2M
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1c
            r0 = r301
            com.facebook.xapp.messaging.capability.vector.Capabilities r0 = r0.A0o
            java.util.BitSet r0 = r0.A00
            r1 = 83
            boolean r0 = r0.get(r1)
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            r302 = r0
        L1e:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.model.User.A0A():boolean");
    }

    public boolean A0B() {
        boolean z = false;
        if (this.A0x == 0S2.A01) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if ("AiBot".equals(r301.A1U) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0C() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A06
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1c
            r0 = r301
            java.lang.String r0 = r0.A1U
            r303 = r0
            java.lang.String r0 = "AiBot"
            r1 = r303
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            r302 = r0
        L1e:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.model.User.A0C():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r301.A0U == X.1Kq.A04) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0D() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A1U
            r302 = r0
            java.lang.String r0 = "InstagramMessagingUser"
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L27
            r0 = r301
            X.1Kq r0 = r0.A0U
            r305 = r0
            X.1Kq r0 = X.1Kq.A04
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            r1 = r302
            if (r0 != r1) goto L29
        L27:
            r0 = 1
            r304 = r0
        L29:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.model.User.A0D():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r301.A0U == X.1Kq.A07) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0E() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A1U
            r302 = r0
            java.lang.String r0 = "page"
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L27
            r0 = r301
            X.1Kq r0 = r0.A0U
            r305 = r0
            X.1Kq r0 = X.1Kq.A07
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            r1 = r302
            if (r0 != r1) goto L29
        L27:
            r0 = 1
            r304 = r0
        L29:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.model.User.A0E():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r301.A0U == X.1Kq.A08) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0F() {
        /*
            r301 = this;
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A0v
            r302 = r0
            r0 = r302
            boolean r0 = X.09K.A00(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L35
            r0 = r301
            java.lang.String r0 = r0.A1U
            r304 = r0
            java.lang.String r0 = "NeoApprovedUser"
            r302 = r0
            r0 = r302
            r1 = r304
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L35
            r0 = r301
            X.1Kq r0 = r0.A0U
            r305 = r0
            X.1Kq r0 = X.1Kq.A08
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r305
            r1 = r304
            if (r0 != r1) goto L37
        L35:
            r0 = 1
            r303 = r0
        L37:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.model.User.A0F():boolean");
    }

    public boolean A0G() {
        return A01(this.A0k.type);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r0 == X.1Kq.A04) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0H() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A1U
            r302 = r0
            java.lang.String r0 = "user"
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L3b
            r0 = r301
            X.1Kq r0 = r0.A0U
            r305 = r0
            X.1Kq r0 = X.1Kq.A02
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L3b
            X.1Kq r0 = X.1Kq.A0B
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L3b
            X.1Kq r0 = X.1Kq.A04
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            r1 = r302
            if (r0 != r1) goto L3d
        L3b:
            r0 = 1
            r304 = r0
        L3d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.model.User.A0H():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A0X);
        sb.append(" ");
        sb.append(this.A13);
        sb.append(" [");
        sb.append(this.A0e.name());
        sb.append("] ");
        ImmutableList immutableList = this.A0r;
        if (!immutableList.isEmpty()) {
            sb.append(((UserEmailAddress) immutableList.get(0)).A00);
            sb.append(" ");
        }
        ImmutableList immutableList2 = this.A0v;
        if (!immutableList2.isEmpty()) {
            sb.append(((ManagingParent) immutableList2.get(0)).mId);
            sb.append(" ");
        }
        if (!this.A01.isEmpty()) {
            sb.append(((UserPhoneNumber) this.A01.get(0)).A04);
            sb.append(" ");
        }
        sb.append("restrictionType-");
        sb.append(this.A0p);
        sb.append(" ");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String A00;
        String str;
        parcel.writeString(this.A13);
        parcel.writeString(this.A0e.name());
        parcel.writeString(this.A1T);
        parcel.writeLong(this.A0R);
        parcel.writeList(this.A0r);
        parcel.writeList(this.A0v);
        parcel.writeList(this.A01);
        parcel.writeParcelable(this.A0X, i);
        parcel.writeParcelable(this.A2G, i);
        parcel.writeString(this.A1N);
        parcel.writeString(C1L9.A01(this.A0C));
        parcel.writeString(this.A2K);
        parcel.writeString(this.A1R);
        parcel.writeString(this.A11);
        parcel.writeParcelable(this.A2N, i);
        parcel.writeParcelable(this.A2O, i);
        parcel.writeString("tmp_value");
        parcel.writeString(this.A1Q);
        parcel.writeFloat(this.A08);
        parcel.writeString(this.A0S.name());
        parcel.writeInt(this.A1a ? 1 : 0);
        parcel.writeInt(this.A1g ? 1 : 0);
        parcel.writeString(this.A1W);
        parcel.writeString(this.A1U);
        parcel.writeString(this.A1P);
        parcel.writeInt(this.A1e ? 1 : 0);
        parcel.writeLong(this.A0Q);
        parcel.writeLong(this.A0I);
        parcel.writeInt(this.A1c ? 1 : 0);
        parcel.writeInt(this.A1b ? 1 : 0);
        parcel.writeString(this.A0a.name());
        parcel.writeInt(this.A1d ? 1 : 0);
        parcel.writeInt(this.A1f ? 1 : 0);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A09);
        parcel.writeString(this.A10);
        parcel.writeString(this.A1S);
        parcel.writeString(this.A1V);
        parcel.writeString(this.A12);
        parcel.writeInt(this.A29 ? 1 : 0);
        parcel.writeInt(this.A2D ? 1 : 0);
        parcel.writeInt(this.A28 ? 1 : 0);
        parcel.writeInt(this.A0T.getDbValue());
        parcel.writeInt(this.A1m ? 1 : 0);
        parcel.writeInt(this.A1Y ? 1 : 0);
        parcel.writeInt(this.A1Z ? 1 : 0);
        parcel.writeInt(this.A1q ? 1 : 0);
        parcel.writeInt(this.A23 ? 1 : 0);
        int i2 = 0;
        parcel.writeInt(0);
        Integer num = this.A0w;
        String str2 = null;
        parcel.writeString(num == null ? null : CBP.A01(num));
        parcel.writeInt(this.A1h ? 1 : 0);
        parcel.writeList(this.A0q);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A0O);
        parcel.writeInt(0);
        parcel.writeInt(this.A1X ? 1 : 0);
        parcel.writeInt(this.A1u ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A2P);
        parcel.writeFloat(this.A07);
        parcel.writeList(ImmutableList.of());
        parcel.writeInt(this.A26 ? 1 : 0);
        parcel.writeInt(this.A1i ? 1 : 0);
        parcel.writeInt(this.A25 ? 1 : 0);
        parcel.writeInt(this.A1j ? 1 : 0);
        1LE r0 = this.A0c;
        parcel.writeString(r0 == null ? null : r0.name());
        parcel.writeInt(this.A2E ? 1 : 0);
        parcel.writeInt(this.A1l ? 1 : 0);
        parcel.writeInt(this.A1k ? 1 : 0);
        parcel.writeInt(0);
        parcel.writeParcelable(this.A0V, i);
        parcel.writeParcelable(this.A0g, i);
        parcel.writeString(C3P4.A01(this.A0x));
        switch (this.A0z.intValue()) {
            case 1:
                A00 = "FOLLOWING";
                break;
            case 2:
                A00 = AbE.A00(37);
                break;
            default:
                A00 = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                break;
        }
        parcel.writeString(A00);
        parcel.writeParcelable(this.A0f, i);
        parcel.writeInt(this.A22 ? 1 : 0);
        parcel.writeString("tmp_value");
        parcel.writeList(this.A0u);
        parcel.writeString(this.A18);
        parcel.writeParcelable(this.A0W, i);
        parcel.writeInt(this.A0E);
        parcel.writeString(this.A1H);
        parcel.writeString("tmp_value");
        parcel.writeInt(this.A1n ? 1 : 0);
        parcel.writeList(this.A0s);
        parcel.writeInt(this.A27 ? 1 : 0);
        parcel.writeInt(this.A24 ? 1 : 0);
        parcel.writeList(this.A0t);
        parcel.writeInt(0);
        parcel.writeInt(this.A1s ? 1 : 0);
        parcel.writeList(ImmutableList.of());
        parcel.writeInt(this.A2B ? 1 : 0);
        parcel.writeInt(this.A2L ? 1 : 0);
        parcel.writeInt(this.A2M ? 1 : 0);
        parcel.writeLong(this.A0P);
        parcel.writeString(this.A1D);
        parcel.writeParcelable(this.A0n, i);
        parcel.writeParcelable(this.A0m, i);
        parcel.writeString(this.A2J);
        parcel.writeList(this.A2H);
        parcel.writeList(this.A2I);
        parcel.writeInt(this.A2C ? 1 : 0);
        parcel.writeString(this.A1B);
        parcel.writeString(this.A14);
        parcel.writeString(this.A1J);
        Integer num2 = this.A0y;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str = "FRIENDS";
                    break;
                case 2:
                    str = "FOLLOWER";
                    break;
                case 3:
                    str = "CONNECTION";
                    break;
                default:
                    str = "UNSET";
                    break;
            }
        } else {
            str = "UNSET";
        }
        parcel.writeString(str);
        parcel.writeInt(this.A21 ? 1 : 0);
        parcel.writeString(this.A16);
        parcel.writeInt(this.A1o ? 1 : 0);
        parcel.writeString(this.A17);
        parcel.writeInt(this.A0G);
        parcel.writeString(this.A0U.name());
        parcel.writeInt(this.A1t ? 1 : 0);
        parcel.writeInt(this.A1r ? 1 : 0);
        parcel.writeInt(this.A0D);
        parcel.writeInt(this.A1v ? 1 : 0);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A0H);
        parcel.writeParcelable(this.A0Y, i);
        parcel.writeInt(this.A1p ? 1 : 0);
        parcel.writeString(this.A1K);
        parcel.writeInt(this.A2A ? 1 : 0);
        parcel.writeInt(this.A1z ? 1 : 0);
        parcel.writeInt(this.A1y ? 1 : 0);
        parcel.writeInt(this.A20 ? 1 : 0);
        C53v.A0K(parcel, this.A0p.dbValue);
        1M1 r02 = this.A0d;
        if (r02 != null) {
            str2 = r02.name();
        }
        parcel.writeString(str2);
        parcel.writeInt(this.A2F ? 1 : 0);
        parcel.writeLong(this.A0N);
        parcel.writeLong(this.A0J);
        parcel.writeLong(this.A0K);
        parcel.writeLong(this.A0L);
        parcel.writeInt(this.A1w ? 1 : 0);
        parcel.writeInt(this.A1x ? 1 : 0);
        parcel.writeString(this.A1I);
        parcel.writeString(this.A1O);
        parcel.writeParcelable(this.A0l, i);
        parcel.writeLong(this.A0M);
        parcel.writeString(this.A19);
        C53v.A0J(parcel, this.A0h);
        parcel.writeString(this.A1E);
        parcel.writeString(this.A1F);
        parcel.writeString(this.A15);
        parcel.writeString(this.A1C);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A1G);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A1M);
        3oC r03 = this.A0b;
        parcel.writeInt(r03 == null ? 0 : r03.mValue.intValue());
        3oD r04 = this.A0Z;
        if (r04 != null) {
            i2 = r04.mValue.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.A1A);
        parcel.writeString(this.A1L);
    }
}
