package com.facebook.quickpromotion.model;

import X.04R;
import X.0QD;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Du;
import X.1Fj;
import X.1I0;
import X.28Q;
import X.2JX;
import X.2JY;
import X.2xC;
import X.2xF;
import X.82N;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass244;
import X.AnonymousClass245;
import X.C00t;
import X.C1n3;
import X.C2209Dh1;
import X.C26c;
import X.C27T;
import X.C2xc;
import X.C42h;
import X.C43g;
import X.C4Ny;
import X.Dky;
import X.FJ8;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.enums.GraphQLQuickPromotionAssetMode;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* loaded from: QuickPromotionDefinition.class */
public final class QuickPromotionDefinition implements Parcelable {
    public static final Companion A05 = new Object();
    public static final Parcelable.Creator CREATOR = new C2xc(51);
    public 2xC A00;
    public ImmutableSet A01;
    public ImmutableList A02;
    public final String A03;
    public final boolean A04;
    public final ImageParameters animatedImageParams;
    public final ImmutableList animations;
    public final BooleanFilter booleanFilter;
    public final ImageParameters brandingImageParams;
    public final ImmutableList bulletList;
    public final boolean clientSideDryRun;
    public final long clientTtlSeconds;
    public final String content;
    public final ImmutableMap customRenderParams;
    public final CustomRenderType customRenderType;
    public final Action dismissAction;
    public final long endTime;
    public final List filters;
    public final String footer;
    public final ImageParameters imageParams;
    public final ImmutableMap instanceLogData;
    public final boolean isExposureHoldout;
    public final boolean logEligibilityWaterfall;
    public final int maxImpressions;
    public final Action primaryAction;
    public final long priority;
    public final String promotionId;
    public final Action secondaryAction;
    public final SocialContext socialContext;
    public final long startTime;
    public final TemplateType template;
    public final ImmutableMap templateParameters;
    public final ImmutableList testCreatives;
    public final String title;
    public final List triggers;
    public final int viewerImpressions;

    /* loaded from: QuickPromotionDefinition$Action.class */
    public final class Action implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C4Ny(42);
        public final boolean dismissPromotion;
        public final int limit;
        public final Style style;
        public final String title;
        public final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: QuickPromotionDefinition$Action$Style.class */
        public final class Style {
            public static final Companion A00;
            public static final /* synthetic */ EnumEntries A01;
            public static final /* synthetic */ Style[] A02;
            public static final Style A03;
            public static final Style A04;
            public static final Style A05;

            /* loaded from: QuickPromotionDefinition$Action$Style$Companion.class */
            public final class Companion {
                public final Style fromString(String str) {
                    try {
                        if (str == null) {
                            return Style.A05;
                        }
                        String upperCase = str.toUpperCase(Locale.ROOT);
                        11T.A0A(upperCase);
                        return Style.valueOf(upperCase);
                    } catch (IllegalArgumentException unused) {
                        return Style.A05;
                    }
                }
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [com.facebook.quickpromotion.model.QuickPromotionDefinition$Action$Style$Companion, java.lang.Object] */
            static {
                Style style = new Style("PROMINENT", 0);
                A04 = style;
                Style style2 = new Style("DEFAULT", 1);
                A03 = style2;
                Style style3 = new Style(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 2);
                A05 = style3;
                Style[] styleArr = {style, style2, style3};
                A02 = styleArr;
                A01 = C00t.A00(styleArr);
                A00 = new Object();
            }

            public Style(String str, int i) {
            }

            public static final Style fromString(String str) {
                return A00.fromString(str);
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) A02.clone();
            }
        }

        public Action() {
            this.style = Style.A05;
            this.title = "";
            this.url = null;
            this.limit = 0;
            this.dismissPromotion = true;
        }

        public Action(Parcel parcel) {
            this.style = Style.A00.fromString(parcel.readString());
            String readString = parcel.readString();
            if (readString == null) {
                throw 1BK.A0h();
            }
            this.title = readString;
            this.url = parcel.readString();
            this.limit = parcel.readInt();
            this.dismissPromotion = AnonymousClass001.A1N(parcel.readInt());
        }

        public Action(Style style, String str, String str2, int i, boolean z) {
            this.style = style;
            this.title = str == null ? "" : str;
            this.url = str2;
            this.limit = i;
            this.dismissPromotion = z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            1BL.A12(parcel, this.style);
            parcel.writeString(this.title);
            parcel.writeString(this.url);
            parcel.writeInt(this.limit);
            parcel.writeInt(this.dismissPromotion ? 1 : 0);
        }
    }

    /* loaded from: QuickPromotionDefinition$Animation.class */
    public final class Animation implements Parcelable {
        public static final Parcelable.Creator CREATOR = FKW.A00(73);
        public final String assetUrl;
        public final String id;
        public final String mode;
        public final String name;
        public final String setSlug;

        public Animation() {
            this.setSlug = null;
            this.assetUrl = null;
            this.mode = null;
            this.name = null;
            this.id = null;
        }

        public Animation(Parcel parcel) {
            this.setSlug = parcel.readString();
            this.assetUrl = parcel.readString();
            this.mode = parcel.readString();
            this.name = parcel.readString();
            this.id = parcel.readString();
        }

        public Animation(String str, String str2, String str3, String str4, String str5) {
            this.setSlug = str;
            this.assetUrl = str3;
            this.mode = str2;
            this.name = str4;
            this.id = str5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeString(this.setSlug);
            parcel.writeString(this.assetUrl);
            parcel.writeString(this.mode);
            parcel.writeString(this.name);
            parcel.writeString(this.id);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: QuickPromotionDefinition$Attribute.class */
    public final class Attribute {
        public static final Companion A00;
        public static final /* synthetic */ EnumEntries A01;
        public static final /* synthetic */ Attribute[] A02;
        public static final Attribute A03;
        public static final Attribute A04;
        public static final Attribute A05;

        /* loaded from: QuickPromotionDefinition$Attribute$Companion.class */
        public final class Companion {
            public final Attribute fromString(String str) {
                if (str == null) {
                    return Attribute.A05;
                }
                try {
                    Locale locale = Locale.US;
                    11T.A0B(locale);
                    String upperCase = str.toUpperCase(locale);
                    11T.A0A(upperCase);
                    return Attribute.valueOf(upperCase);
                } catch (IllegalArgumentException unused) {
                    return Attribute.A05;
                }
            }
        }

        /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, com.facebook.quickpromotion.model.QuickPromotionDefinition$Attribute$Companion] */
        static {
            Attribute attribute = new Attribute("IS_UNCANCELABLE", 0);
            A04 = attribute;
            Attribute attribute2 = new Attribute("BYPASS_SURFACE_DELAY", 1);
            A03 = attribute2;
            Attribute attribute3 = new Attribute(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 2);
            A05 = attribute3;
            Attribute[] attributeArr = {attribute, attribute2, attribute3};
            A02 = attributeArr;
            A01 = C00t.A00(attributeArr);
            A00 = new Object();
        }

        public Attribute(String str, int i) {
        }

        public static final Attribute fromString(String str) {
            return A00.fromString(str);
        }

        public static Attribute valueOf(String str) {
            return (Attribute) Enum.valueOf(Attribute.class, str);
        }

        public static Attribute[] values() {
            return (Attribute[]) A02.clone();
        }
    }

    /* loaded from: QuickPromotionDefinition$BooleanFilter.class */
    public final class BooleanFilter implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C4Ny(43);
        public final FilterClause A00;

        /* loaded from: QuickPromotionDefinition$BooleanFilter$Deserializer.class */
        public final class Deserializer extends JsonDeserializer {
            @Override // com.fasterxml.jackson.databind.JsonDeserializer
            public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
                11T.A0F(abstractC01033pi, 0);
                if (abstractC01033pi.A1J() == C42h.A09) {
                    return null;
                }
                AnonymousClass245 A1M = abstractC01033pi.A1M();
                11T.A0I(A1M, "null cannot be cast to non-null type com.facebook.common.json.FbObjectMapper");
                Object A1W = ((AnonymousClass244) A1M)._jsonFactory.A05(abstractC01033pi.A1Z()).A1W(FilterClause.class);
                11T.A0A(A1W);
                return new BooleanFilter((FilterClause) A1W);
            }
        }

        /* loaded from: QuickPromotionDefinition$BooleanFilter$Serializer.class */
        public final class Serializer extends JsonSerializer {
            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
                BooleanFilter booleanFilter = (BooleanFilter) obj;
                11T.A0F(r302, 1);
                if (booleanFilter == null) {
                    r302.A0Z();
                    return;
                }
                AnonymousClass245 A0L = r302.A0L();
                11T.A0I(A0L, "null cannot be cast to non-null type com.facebook.common.json.FbObjectMapper");
                r302.A0r(((AnonymousClass244) A0L).A0W(booleanFilter.A00));
            }
        }

        public BooleanFilter(Parcel parcel) {
            Parcelable A0C = 1BL.A0C(parcel, FilterClause.class);
            if (A0C == null) {
                throw 1BK.A0h();
            }
            this.A00 = (FilterClause) A0C;
        }

        public BooleanFilter(FilterClause filterClause) {
            11T.A0F(filterClause, 1);
            this.A00 = filterClause;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeParcelable(this.A00, i);
        }
    }

    /* loaded from: QuickPromotionDefinition$BulletListItem.class */
    public final class BulletListItem implements Parcelable {
        public static final Parcelable.Creator CREATOR = new 82N(4);
        public final ImageParameters dark_icon;
        public final ImageParameters icon;
        public final String subtitle;
        public final String title;

        public BulletListItem() {
            this.title = null;
            this.subtitle = null;
            this.icon = null;
            this.dark_icon = null;
        }

        public BulletListItem(Parcel parcel) {
            this.title = parcel.readString();
            this.subtitle = parcel.readString();
            this.icon = (ImageParameters) 1BL.A0C(parcel, ImageParameters.class);
            this.dark_icon = (ImageParameters) 1BL.A0C(parcel, ImageParameters.class);
        }

        public BulletListItem(ImageParameters imageParameters, ImageParameters imageParameters2, String str, String str2) {
            this.title = str;
            this.subtitle = str2;
            this.icon = imageParameters;
            this.dark_icon = imageParameters2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.icon, i);
            parcel.writeParcelable(this.dark_icon, i);
        }
    }

    /* loaded from: QuickPromotionDefinition$Companion.class */
    public final class Companion {
        public static final Action A00(2JX r301) {
            String str = null;
            if (r301 == null) {
                return null;
            }
            Action.Style style = Action.Style.A03;
            2JY A0L = r301.A0L(110371416, 2JX.class, 1834883869);
            if (A0L != null) {
                str = A0L.A0r(3556653);
            }
            return new Action(style, str, r301.A0r(116079), r301.getIntValue(102976443), r301.getBooleanValue(856917294));
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static final FilterClause A01(2xF r301, List list) {
            FBBooleanType fBBooleanType;
            String A0t = r301.A0t(GraphQLStringDefUtil.A00(), "GraphQLQuickPromotionFilterClauseType", -1065629686);
            if (A0t != null) {
                switch (A0t.hashCode()) {
                    case -1963485176:
                        if (A0t.equals("NOR_TYPE")) {
                            fBBooleanType = FBBooleanType.A04;
                            break;
                        }
                        break;
                    case -463737834:
                        if (A0t.equals("OR_TYPE")) {
                            fBBooleanType = FBBooleanType.A05;
                            break;
                        }
                        break;
                    case -138527550:
                        if (A0t.equals("AND_TYPE")) {
                            fBBooleanType = FBBooleanType.A03;
                            break;
                        }
                        break;
                }
                return new FilterClause(fBBooleanType, A04(r301.A0c(-854547461, 2JX.class, 624579355)), list);
            }
            fBBooleanType = FBBooleanType.A06;
            return new FilterClause(fBBooleanType, A04(r301.A0c(-854547461, 2JX.class, 624579355)), list);
        }

        public static final ImageParameters A02(2JX r301) {
            if (r301 == null) {
                return null;
            }
            return new ImageParameters(r301.A0r(116076), (float) r301.getDoubleValue(109250890), r301.getIntValue(113126854), r301.getIntValue(-1221029593));
        }

        public static final QuickPromotionDefinition A03(2xC r301) {
            2JX A0u;
            QuickPromotionDefinition quickPromotionDefinition = null;
            if (r301 != null && (A0u = r301.A0u()) != null && !A0u.A0c(598509220, 2JX.class, -206750890).isEmpty()) {
                quickPromotionDefinition = new QuickPromotionDefinition(r301);
            }
            return quickPromotionDefinition;
        }

        public static final ImmutableList A04(List list) {
            ImmutableList build;
            if (list == null) {
                build = ImmutableList.of();
            } else {
                ImmutableList.Builder builder = ImmutableList.builder();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    2JX r0 = (2JX) it.next();
                    ContextualFilter.Type fromString = ContextualFilter.Type.A00.fromString(r0.A0r(-889919583));
                    boolean booleanValue = r0.getBooleanValue(-1725409696);
                    String A06 = A06(r0.A0L(111972721, 2JX.class, 1410044615));
                    if (A06 == null) {
                        A06 = "";
                    }
                    builder.m11011add((Object) new ContextualFilter(fromString, A06, A05(r0.A2K(1693954330, 1410044615)), booleanValue));
                }
                build = builder.build();
            }
            11T.A0A(build);
            return build;
        }

        public static final ImmutableMap A05(ImmutableList immutableList) {
            ImmutableMap immutableMap;
            String A0r;
            if (immutableList == null || immutableList.isEmpty()) {
                immutableMap = RegularImmutableMap.A03;
            } else {
                ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    2JX r0 = (2JX) it.next();
                    String A06 = A06(r0);
                    if (A06 != null && (A0r = r0.A0r(3373707)) != null) {
                        builder.put(A0r, A06);
                    }
                }
                immutableMap = builder.build();
            }
            11T.A0A(immutableMap);
            return immutableMap;
        }

        public static final String A06(2JX r301) {
            Object obj;
            if (r301 == null) {
                return null;
            }
            if (r301.getTypeName() == null) {
                0fH.A0k("QuickPromotionDefinition", "param.getTypeName() returned null.");
                return null;
            }
            String typeName = r301.getTypeName();
            if (typeName == null) {
                return null;
            }
            switch (typeName.hashCode()) {
                case -2118635745:
                    obj = "QPStringTemplateParameter";
                    break;
                case -697103137:
                    if (typeName.equals("QPIntTemplateParameter")) {
                        return String.valueOf(r301.getIntValue(334404897));
                    }
                    return null;
                case -582117333:
                    if (typeName.equals("QPColorTemplateParameter")) {
                        return r301.A0r(1327091093);
                    }
                    return null;
                case 1271649874:
                    if (typeName.equals("QPFloatTemplateParameter")) {
                        return String.valueOf(r301.getDoubleValue(-1456152114));
                    }
                    return null;
                case 1279171142:
                    if (typeName.equals("QPBooleanTemplateParameter")) {
                        return String.valueOf(r301.getBooleanValue(-766126116));
                    }
                    return null;
                case 1883206686:
                    obj = "QPStringEnumTemplateParameter";
                    break;
                default:
                    return null;
            }
            if (typeName.equals(obj)) {
                return r301.A0r(425739203);
            }
            return null;
        }
    }

    /* loaded from: QuickPromotionDefinition$ContextualFilter.class */
    public final class ContextualFilter implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C4Ny(44);
        public final Map extraData;
        public final boolean passIfNotSupported;
        public final Type type;
        public final String value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: QuickPromotionDefinition$ContextualFilter$Type.class */
        public final class Type {
            public static final Companion A00;
            public static final /* synthetic */ EnumEntries A01;
            public static final /* synthetic */ Type[] A02;
            public static final Type A03;
            public static final Type A04;
            public static final Type A05;
            public static final Type A06;
            public static final Type A07;
            public static final Type A08;
            public static final Type A09;
            public static final Type A0A;
            public static final Type A0B;
            public static final Type A0C;
            public static final Type A0D;
            public static final Type A0E;
            public static final Type A0F;
            public static final Type A0G;
            public static final Type A0H;
            public static final Type A0I;
            public static final Type A0J;
            public static final Type A0K;
            public static final Type A0L;
            public static final Type A0M;
            public static final Type A0N;
            public static final Type A0O;
            public static final Type A0P;
            public static final Type A0Q;
            public static final Type A0R;
            public static final Type A0S;
            public static final Type A0T;
            public static final Type A0U;
            public static final Type A0V;
            public static final Type A0W;
            public static final Type A0X;
            public static final Type A0Y;
            public static final Type A0Z;
            public static final Type A0a;
            public static final Type A0b;
            public static final Type A0c;
            public static final Type A0d;
            public static final Type A0e;
            public static final Type A0f;
            public static final Type A0g;
            public static final Type A0h;
            public static final Type A0i;
            public static final Type A0j;
            public static final Type A0k;
            public static final Type A0l;
            public static final Type A0m;
            public static final Type A0n;
            public static final Type A0o;
            public static final Type A0p;
            public static final Type A0q;
            public static final Type A0r;
            public static final Type A0s;
            public static final Type A0t;
            public static final Type A0u;
            public static final Type A0v;
            public static final Type A0w;
            public static final Type A0x;
            public static final Type A0y;
            public static final Type A0z;
            public static final Type A10;
            public static final Type A11;
            public static final Type A12;
            public static final Type A13;
            public static final Type A14;
            public static final Type A15;
            public static final Type A16;
            public static final Type A17;
            public static final Type A18;
            public static final Type A19;
            public static final Type A1A;
            public static final Type A1B;
            public static final Type A1C;
            public static final Type A1D;
            public static final Type A1E;
            public static final Type A1F;
            public static final Type A1G;
            public static final Type A1H;
            public static final Type A1I;
            public static final Type A1J;
            public static final Type A1K;
            public static final Type A1L;
            public static final Type A1M;
            public static final Type A1N;
            public static final Type A1O;
            public static final Type A1P;
            public static final Type A1Q;
            public static final Type A1R;
            public static final Type A1S;
            public static final Type A1T;
            public static final Type A1U;
            public static final Type A1V;
            public static final Type A1W;
            public static final Type A1X;
            public static final Type A1Y;
            public static final Type A1Z;
            public static final Type A1a;
            public static final Type A1b;
            public static final Type A1c;
            public static final Type A1d;
            public static final Type A1e;
            public static final Type A1f;
            public static final Type A1g;
            public static final Type A1h;
            public static final Type A1i;
            public static final Type A1j;
            public static final Type A1k;
            public static final Type A1l;
            public static final Type A1m;
            public static final Type A1n;
            public static final Type A1o;
            public static final Type A1p;
            public static final Type A1q;
            public static final Type A1r;
            public static final Type A1s;
            public static final Type A1t;
            public static final Type A1u;
            public static final Type A1v;
            public static final Type A1w;
            public static final Type A1x;
            public static final Type A1y;
            public static final Type A1z;
            public static final Type A20;
            public static final Type A21;
            public static final Type A22;
            public static final Type A23;
            public static final Type A24;
            public static final Type A25;
            public static final Type A26;
            public static final Type A27;
            public static final Type A28;
            public static final Type A29;
            public static final Type A2A;
            public static final Type A2B;
            public static final Type A2C;
            public static final Type A2D;
            public static final Type A2E;
            public static final Type A2F;
            public static final Type A2G;
            public static final Type A2H;
            public static final Type A2I;
            public static final Type A2J;
            public static final Type A2K;
            public static final Type A2L;
            public static final Type A2M;
            public static final Type A2N;
            public static final Type A2O;
            public static final Type A2P;
            public static final Type A2Q;
            public static final Type A2R;
            public static final Type A2S;
            public static final Type A2T;
            public static final Type A2U;
            public static final Type A2V;
            public static final Type A2W;
            public static final Type A2X;
            public static final Type A2Y;
            public static final Type A2Z;
            public static final Type A2a;
            public static final Type A2b;
            public static final Type A2c;
            public static final Type A2d;
            public static final Type A2e;
            public static final Type A2f;
            public static final Type A2g;
            public static final Type A2h;
            public static final Type A2i;
            public static final Type A2j;
            public static final Type A2k;
            public static final Type A2l;
            public static final Type A2m;
            public static final Type A2n;
            public static final Type A2o;
            public static final Type A2p;
            public static final Type A2q;
            public static final Type A2r;
            public static final Type A2s;
            public static final Type A2t;
            public static final Type A2u;
            public static final Type A2v;
            public static final Type A2w;
            public static final Type A2x;
            public static final Type A2y;
            public static final Type A2z;
            public static final Type A30;
            public static final Type A31;
            public static final Type A32;
            public static final Type A33;
            public static final Type A34;
            public static final Type A35;
            public static final Type A36;
            public static final Type A37;
            public static final Type A38;
            public static final Type A39;
            public static final Type A3A;
            public static final Type A3B;
            public static final Type A3C;
            public static final Type A3D;
            public static final Type A3E;
            public static final Type A3F;
            public static final Type A3G;
            public static final Type A3H;
            public static final Type A3I;
            public static final Type A3J;
            public static final Type A3K;
            public static final Type A3L;
            public static final Type A3M;
            public static final Type A3N;
            public static final Type A3O;
            public static final Type A3P;
            public static final Type A3Q;
            public static final Type A3R;
            public static final Type A3S;
            public static final Type A3T;
            public static final Type A3U;
            public static final Type A3V;
            public static final Type A3W;
            public static final Type A3X;
            public static final Type A3Y;
            public static final Type A3Z;
            public static final Type A3a;
            public static final Type A3b;
            public static final Type A3c;
            public static final Type A3d;
            public static final Type A3e;
            public static final Type A3f;
            public static final Type A3g;
            public static final Type A3h;
            public static final Type A3i;
            public static final Type A3j;

            /* loaded from: QuickPromotionDefinition$ContextualFilter$Type$Companion.class */
            public final class Companion {
                public final Type fromString(String str) {
                    try {
                        if (str == null) {
                            return Type.A3b;
                        }
                        String upperCase = str.toUpperCase(Locale.ROOT);
                        11T.A0A(upperCase);
                        return Type.valueOf(upperCase);
                    } catch (IllegalArgumentException unused) {
                        return Type.A3b;
                    }
                }
            }

            /* JADX WARN: Type inference failed for: r0v1069, types: [com.facebook.quickpromotion.model.QuickPromotionDefinition$ContextualFilter$Type$Companion, java.lang.Object] */
            static {
                Type type = new Type("ANIMATIONS_DOWNLOADED", 0);
                A0E = type;
                Type type2 = new Type("WIFI_CONNECTED", 1);
                A3i = type2;
                Type type3 = new Type("NETWORK_CONNECTIVITY", 2);
                A2q = type3;
                Type type4 = new Type("MOBILE_NETWORK_AVAILABLE", 3);
                A2o = type4;
                Type type5 = new Type("ANDROID_PERMISSIONS_ANY_DISABLED", 4);
                A0D = type5;
                Type type6 = new Type("AVAILABLE_APP_STORAGE_KB", 5);
                A0M = type6;
                Type type7 = new Type("MAX_AVAILABLE_APP_STORAGE_KB", 6);
                A1Y = type7;
                Type type8 = new Type("FACEBOOK_MESSENGER_INSTALLED", 7);
                A0l = type8;
                Type type9 = new Type("FB_RMS_HAS_CAMERA_ROLL_PERMISSION", 8);
                A0x = type9;
                Type type10 = new Type("TIME_OF_DAY_BEFORE", 9);
                A3a = type10;
                Type type11 = new Type("TIME_OF_DAY_AFTER", 10);
                A3Z = type11;
                Type type12 = new Type("APP_MIN_VERSION", 11);
                A0K = type12;
                Type type13 = new Type("APP_MAX_VERSION", 12);
                A0I = type13;
                Type type14 = new Type("SECONDS_SINCE_LAST_IMPRESSION", 13);
                A3L = type14;
                Type type15 = new Type("GOOGLE_PLAY_AVAILABLE", 14);
                A11 = type15;
                Type type16 = new Type("PREINSTALLED_APP", 15);
                A36 = type16;
                Type type17 = new Type("SECONDS_SINCE_FOREGROUND", 16);
                A3J = type17;
                Type type18 = new Type("GOOGLE_ACCOUNT_AVAILABLE", 17);
                A10 = type18;
                Type type19 = new Type("AGGREGATE_CAP", 18);
                A05 = type19;
                Type type20 = new Type("PREFETCH_ALL_ASSETS", 19);
                A34 = type20;
                Type type21 = new Type("SECONDS_SINCE_MESSAGE_RECEIVED", 20);
                A3M = type21;
                Type type22 = new Type("SECONDS_SINCE_MESSAGE_SENT", 21);
                A3N = type22;
                Type type23 = new Type("APP_INSTALLED", 22);
                A0F = type23;
                Type type24 = new Type("APP_NOT_INSTALLED", 23);
                A0L = type24;
                Type type25 = new Type("APP_MAX_DAYS_INSTALLED", 24);
                A0H = type25;
                Type type26 = new Type("METERED_CONNECTION", 25);
                A2Y = type26;
                Type type27 = new Type("SECONDS_SINCE_METERED_CONNECTION_CHANGED_LT", 26);
                A3O = type27;
                Type type28 = new Type("MIN_MANUAL_NEWSFEED_REFRESHES", 27);
                A2l = type28;
                Type type29 = new Type("REMAINING_BATTERY_LEVEL", 28);
                A3F = type29;
                Type type30 = new Type("OTHER_PROMOTION_EVENT", 29);
                A2z = type30;
                Type type31 = new Type("CI_CONT_SYNC_CONSENT", 30);
                A0Y = type31;
                Type type32 = new Type("CI_CONT_SYNC_EVER_CONSENT", 31);
                A0Z = type32;
                Type type33 = new Type("CI_CONSENT", 32);
                A0X = type33;
                Type type34 = new Type("CONTACTS_UPLOAD_ENABLED", 33);
                A0c = type34;
                Type type35 = new Type("PYMK_CONTACT_IMPORTER", 34);
                A3D = type35;
                Type type36 = new Type("CONTACT_IMPORTER_SKIPPED", 35);
                A0d = type36;
                Type type37 = new Type("CCU_SYSTEM_PERMISSION", 36);
                A0W = type37;
                Type type38 = new Type("LOW_CONFIDENCE_PHONE_NUMBER_CLIENT", 37);
                A1W = type38;
                Type type39 = new Type("LOW_CONFIDENCE_PHONE_NUMBER_MRC_CLIENT", 38);
                A1X = type39;
                Type type40 = new Type("PNU_SMART_TARGETING_CLIENT", 39);
                A33 = type40;
                Type type41 = new Type("SIGNALS_SMART_TARGETING_CLIENT_QP", 40);
                A3R = type41;
                Type type42 = new Type("SMS_TAKEOVER_READONLY_MODE", 41);
                A3W = type42;
                Type type43 = new Type("SMS_TAKEOVER_FULL_MODE", 42);
                A3S = type43;
                Type type44 = new Type("SMS_TAKEOVER_SMS_ENABLED", 43);
                A3X = type44;
                Type type45 = new Type("SMS_TAKEOVER_IN_SMS_THREAD_VIEW", 44);
                A3T = type45;
                Type type46 = new Type("SMS_TAKEOVER_MESSENGER_HAS_BEEN_DEFAULT_SMS_APP", 45);
                A3U = type46;
                Type type47 = new Type("SMS_TAKEOVER_MIN_DAYS_SINCE_OPT_OUT", 46);
                A3V = type47;
                Type type48 = new Type("RECENT_SMS_THREADS_BANNER", 47);
                A3E = type48;
                Type type49 = new Type("CLOCK_SKEW", 48);
                A0a = type49;
                Type type50 = new Type("DIRECT_INSTALL_ENABLED", 49);
                A0j = type50;
                Type type51 = new Type("DIALTONE_ACTIVE", 50);
                A0g = type51;
                Type type52 = new Type("WALLFEED_ACTIVATION", 51);
                A3g = type52;
                Type type53 = new Type("DIALTONE_AVAILABLE", 52);
                A0h = type53;
                Type type54 = new Type("UNREAD_MESSAGES", 53);
                A3c = type54;
                Type type55 = new Type("NEW_VERSION_TO_INSTALL", 54);
                A2r = type55;
                Type type56 = new Type("OTHER_PROFILE_RTC_PRESENCE", 55);
                A2y = type56;
                Type type57 = new Type("OTHER_PROFILE_COMMUNICATION_COEFFICIENT", 56);
                A2w = type57;
                Type type58 = new Type("OMNISTORE_KEY_JUST_WRITTEN", 57);
                A2v = type58;
                Type type59 = new Type("OTHER_PROFILE_IS_BIRTHDAY", 58);
                A2x = type59;
                Type type60 = new Type("MESSAGES_SENT_ONE_AFTER_THE_OTHER", 59);
                A1c = type60;
                Type type61 = new Type("SECONDS_SINCE_LAST_DISMISSAL", 60);
                A3K = type61;
                Type type62 = new Type("CANNOT_VIEW_CONTEXT_PROFILE_VIDEO", 61);
                A0O = type62;
                Type type63 = new Type("CANNOT_CREATE_PROFILE_VIDEO", 62);
                A0N = type63;
                Type type64 = new Type("LOCALE", 63);
                A1N = type64;
                Type type65 = new Type("IS_MISSING_PROFILE_PICTURE", 64);
                A1H = type65;
                Type type66 = new Type("INSTANT_GAME_NOTIFY_ENABLED", 65);
                A18 = type66;
                Type type67 = new Type("LOCATION_SERVICES_ALWAYS", 66);
                A1T = type67;
                Type type68 = new Type("APP_MIN_LAST_UPDATED", 67);
                A0J = type68;
                Type type69 = new Type("ZERO_BALANCE_TOGGLE", 68);
                A3j = type69;
                Type type70 = new Type("THREAD_TYPE", 69);
                A3Y = type70;
                Type type71 = new Type("APP_INSTALLED_BY_GOOGLE_PLAY", 70);
                A0G = type71;
                Type type72 = new Type("MESSENGER_ONLY_HAS_NO_PASSWORD", 71);
                A22 = type72;
                Type type73 = new Type("VIDEO_SOUND_ON_IN_NEWS_FEED_SETTINGS", 72);
                A3f = type73;
                Type type74 = new Type("DIALTONE_SWITCH_MEGAPHONE_CLIENT", 73);
                A0i = type74;
                Type type75 = new Type("CAN_SHOW_INSTAGRAM_CONTACT_IMPORTER", 74);
                A0Q = type75;
                Type type76 = new Type("MOMENTS_HAS_CONTACT_PERMISSION", 75);
                A2p = type76;
                Type type77 = new Type("WECHAT_INSTALLED", 76);
                A3h = type77;
                Type type78 = new Type("VIDEO_HOME_OPENED_THIS_SESSION", 77);
                A3e = type78;
                Type type79 = new Type("LOCATION_HISTORY", 78);
                A1S = type79;
                Type type80 = new Type("LOCATION_SERVICES_DEPRIORITIZED", 79);
                A1U = type80;
                Type type81 = new Type("LOCAL_DEVICE_TIME_AND_DATE_BEFORE", 80);
                A1P = type81;
                Type type82 = new Type("LOCAL_DEVICE_TIME_AND_DATE_AFTER", 81);
                A1O = type82;
                Type type83 = new Type("LOCAL_MESSAGES_EXPIRATION_SHOULD_UPSELL_EB", 82);
                A1Q = type83;
                Type type84 = new Type("PHOTOS_PERMISSION_GRANTED", 83);
                A32 = type84;
                Type type85 = new Type("PASSWORD_SAVED", 84);
                A31 = type85;
                Type type86 = new Type("GMAIL_ACQUISITION_PROMOTION", 85);
                A0y = type86;
                Type type87 = new Type("GMAIL_CONFIRMATION_STATUS", 86);
                A0z = type87;
                Type type88 = new Type("FB_BIZ_DEFINITION_MID_CONFIDENCE_FLOW", 87);
                A0u = type88;
                Type type89 = new Type("FB_BIZ_DEFINITION_MID_CONFIDENCE_LIGHTWEIGHT", 88);
                A0v = type89;
                Type type90 = new Type("IS_OTHER_IN_SOCIAL_CONTEXT", 89);
                A1I = type90;
                Type type91 = new Type("CAN_VIEWER_ONLY_ACTIVATED_KID_ACCOUNT_CONNECT_TO_OTHER_USER_ONLY_KID_ACCOUNT", 90);
                A0R = type91;
                Type type92 = new Type("IS_CANONICAL_THREAD_WITH_MK_ACCOUNT", 91);
                A1B = type92;
                Type type93 = new Type("CAP_DISMISSALS_PER_MESSENGER_THREAD", 92);
                A0S = type93;
                Type type94 = new Type("CAP_IMPRESSIONS_PER_MESSENGER_THREAD", 93);
                A0T = type94;
                Type type95 = new Type("CAP_PRIMARY_ACTION_PER_MESSENGER_THREAD", 94);
                A0U = type95;
                Type type96 = new Type("CAP_SECONDARY_ACTION_PER_MESSENGER_THREAD", 95);
                A0V = type96;
                Type type97 = new Type("JIO_PHONE", 96);
                A1M = type97;
                Type type98 = new Type("MESSENGER_USER_HAS_TOGGLED_DARK_MODE_SWITCH", 97);
                A2Q = type98;
                Type type99 = new Type("PUSH_ENABLED", 98);
                A3C = type99;
                Type type100 = new Type("MIN_UNSEEN_MESSENGER_THREADS", 99);
                A2n = type100;
                Type type101 = new Type("CLOSE_CONNECTION", 100);
                A0b = type101;
                Type type102 = new Type("MESSENGER_COMMUNICATION_SCORE", ActionId.ON_VIEW_CREATED_END);
                A1o = type102;
                Type type103 = new Type("MESSENGER_HAS_JOINED_HIDDEN_ARMADILLO_GROUP", ActionId.DATA_LOAD_START);
                A1w = type103;
                Type type104 = new Type("MESSENGER_THREAD_TYPE", ActionId.LEGACY_MARKER);
                A2K = type104;
                Type type105 = new Type("MESSENGER_MAX_GROUP_THREAD_PARTICIPANTS_SIZE", ActionId.ACTION_BAR_COMPLETE);
                A1z = type105;
                Type type106 = new Type("MESSENGER_THREAD_WITH_EMPLOYEE", ActionId.ABORTED);
                A2M = type106;
                Type type107 = new Type("MESSENGER_THREAD_WITH_SELF", ActionId.QUERY_READY);
                A2N = type107;
                Type type108 = new Type("IS_INTEROP_THREAD", ActionId.RTMP_PACKET_RECEIVED);
                A1G = type108;
                Type type109 = new Type("IS_COMMUNITY_MESSAGING_ENBALED", 108);
                A1C = type109;
                Type type110 = new Type("IS_VIEWER_ELIGIBLE_FOR_CREATE_COMMUNITY_CHANNEL_BANNER", ActionId.RTMP_CONNECTION_REQUESTED);
                A1K = type110;
                Type type111 = new Type("MESSENGER_THREAD_IS_COMMUNITY_CHAT", ActionId.RTMP_CONNECTION_RELEASE);
                A2C = type111;
                Type type112 = new Type("MESSENGER_THREAD_IS_PUBLIC_CHAT", ActionId.NEW_START_FOUND);
                A2H = type112;
                Type type113 = new Type("MESSENGER_THREAD_IS_ADMOD_CHAT", ActionId.MISSED_EVENT);
                A2A = type113;
                Type type114 = new Type("HAS_USER_SEEN_MIB_INBOX", ActionId.TIMEOUT);
                A17 = type114;
                Type type115 = new Type("CAN_OTHER_USER_BE_INVITED_TO_MESSENGER_KIDS_IN_THREAD", ActionId.CONTROLLER_INITIATED);
                A0P = type115;
                Type type116 = new Type("MCOM_CAN_SELLER_IN_THREAD_GIVE_SELLER_SEEDED_INCENTIVES", ActionId.RTMP_STREAM_PREPARED);
                A1Z = type116;
                Type type117 = new Type("MCOM_DOES_BUYER_HAVE_UNPAID_PAYMENT_REQUEST_IN_THREAD", ActionId.VIDEO_PLAYING);
                A1a = type117;
                Type type118 = new Type("MCOM_IS_SELLER_IN_THREAD_ONBOARDED", ActionId.RTMP_CONNECTION_CONNECTED);
                A1b = type118;
                Type type119 = new Type("IS_USER_IN_MIB_SEGMENT_A", ActionId.RTMP_CONNECTION_FAILED);
                A1J = type119;
                Type type120 = new Type("MIN_UNREAD_MESSENGER_THREAD_WITH_MK_PARENT", ActionId.RTMP_CONNECTION_INTERCEPTED);
                A2m = type120;
                Type type121 = new Type("DAYS_SINCE_INBOUND_MK_INVITE_FROM_OTHER_MESSENGER_USER", ActionId.VIDEO_SET_RENDERER_CONTEXT);
                A0e = type121;
                Type type122 = new Type("INTL_RLX_LANGUAGE_PROMOTION_SWITCH", ActionId.HEADER_DATA_LOADED);
                A19 = type122;
                Type type123 = new Type("INTL_RLX_PER_DEVICE_SUGGESTED_SWITCH", ActionId.CARD_DATA_LOADED);
                A1A = type123;
                Type type124 = new Type("HAS_TAB_ON_CLIENT", ActionId.VIEW_WILL_APPEAR_BEGIN);
                A16 = type124;
                Type type125 = new Type("HAS_OS_NOTIFICATION_SETTINGS_ENABLED_ON_CLIENT", ActionId.VIEW_DID_LOAD_BEGIN);
                A14 = type125;
                Type type126 = new Type("ANDROID_MESSENGER_HOSTED_IN_CHAT_HEADS", 125);
                A0A = type126;
                Type type127 = new Type("ANDROID_MESSENGER_CHAT_HEADS_ENABLED", ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES);
                A09 = type127;
                Type type128 = new Type("ANDROID_MESSENGER_CHAT_HEADS_BYPASS_DND", 127);
                A08 = type128;
                Type type129 = new Type("ANDROID_MESSENGER_THREAD_IS_BIC_ELIGIBLE", 128);
                A0B = type129;
                Type type130 = new Type("ANDROID_MESSENGER_BUBBLES_ENABLED", ActionId.MESSENGER_QUEUE_CREATION);
                A07 = type130;
                Type type131 = new Type("MESSENGER_VANISH_MODE_ENABLED", ActionId.APP_DID_FINISH_LAUNCHING);
                A2W = type131;
                Type type132 = new Type("MESSENGER_SURFACE_OPENED_WITH_TRIGGER", ActionId.APP_DID_BECOME_ACTIVE);
                A26 = type132;
                Type type133 = new Type("ANDROID_MESSENGER_APP_LOCK_ELIGIBLE", ActionId.APP_WILL_ENTER_FOREGROUND);
                A06 = type133;
                Type type134 = new Type("DO_NOT_DISTURB_MODE", ActionId.APP_DID_ENTER_BACKGROUND);
                A0k = type134;
                Type type135 = new Type("ACTIVE_STATUS_SETTING", ActionId.APP_MAIN);
                A04 = type135;
                Type type136 = new Type("IS_VIEWER_THE_POST_AUTHOR", ActionId.MQTT_CONNECTING);
                A1L = type136;
                Type type137 = new Type("LOCAL_PHONE_ACQUISITION", ActionId.MQTT_CONNECTED);
                A1R = type137;
                Type type138 = new Type("MESSENGER_THREAD_HAS_RESTRICTED_FEATURES", ActionId.MQTT_DISCONNECTED);
                A29 = type138;
                Type type139 = new Type("MESSENGER_THREAD_CONTAINS_E2EE_ONLY_CONTACT", ActionId.MESSENGER_DELTA_REQUEST);
                A27 = type139;
                Type type140 = new Type("MESSENGER_OPENED_THREAD_FROM_NOTIFICATION_TYPE", ActionId.APP_FIRST_VIEW_CONTROLLER);
                A23 = type140;
                Type type141 = new Type("MESSENGER_OPENED_THREAD_FROM_NOTIFICATION_TYPE_ANDROID", ActionId.MESSENGER_THREAD_LIST_LOADED);
                A24 = type141;
                Type type142 = new Type("MESSENGER_CHECK_BOOLEAN_LOCAL_USER_SETTING", ActionId.MESSENGER_THREAD_LIST_DISPLAYED);
                A1i = type142;
                Type type143 = new Type("GROUP_USER_CAN_TAG_RULES", ActionId.PREV_ACTIVITY_PAUSE);
                A13 = type143;
                Type type144 = new Type("MESSENGER_DEPRECATING_SMS_READ_ONLY_MODE", ActionId.ACTIVITY_RESUME);
                A1p = type144;
                Type type145 = new Type("MESSENGER_MULTI_ACCOUNT_SMS_SETTING_UPDATE", ActionId.ACTIVITY_START);
                A21 = type145;
                Type type146 = new Type("PASSPOINT_CONFIGURATION_SUPPORTED", ActionId.BEGIN_START_ACTIVITY);
                A30 = type146;
                Type type147 = new Type("MESSENGER_MIN_GROUP_THREAD_PARTICIPANTS_SIZE", ActionId.END_START_ACTIVITY);
                A20 = type147;
                Type type148 = new Type("MESSENGER_THREAD_VIEWER_IS_PARTICIPANT", ActionId.FILE_SYSTEM_FAIL);
                A2L = type148;
                Type type149 = new Type("MESSENGER_THREAD_IS_IGNORED", ActionId.FORMAT_ERROR);
                A2F = type149;
                Type type150 = new Type("MESSENGER_TIME_SINCE_INSTALLED", ActionId.PRIVACY_VIOLATION);
                A2P = type150;
                Type type151 = new Type("MESSENGER_ENCRYPTED_BACKUP_DEVICE_ONBOARDED", 150);
                A1q = type151;
                Type type152 = new Type("MESSENGER_ENCRYPTED_BACKUP_HAS_BACKUP", ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE);
                A1r = type152;
                Type type153 = new Type("MESSENGER_ENCRYPTED_BACKUP_LOW_SPACE_WARNING", ActionId.APPLY_OPTIMISTICS);
                A1s = type153;
                Type type154 = new Type("PREFILL_PHONE_ACQUISITION", ActionId.APPLY_FINISHED_LIST);
                A35 = type154;
                Type type155 = new Type("MESSENGER_TIME_MIN_SINCE_ENCRYPTED_BACKUP_NUX_FINISHED", ActionId.APPLY_FINISHED_LIST_AGAIN);
                A2O = type155;
                Type type156 = new Type("ANDROID_MESSENGER_THREAD_PRIVATE_REPLY_TIPS_ELIGIBLE", ActionId.FUTURE_LISTENERS_COMPLETE);
                A0C = type156;
                Type type157 = new Type("SAME_PROFILE_IN_FB_APP", ActionId.SERVICE_ON_START_COMMAND);
                A3H = type157;
                Type type158 = new Type("MIB_BOTH_FB_MSGR_INSTALLED_CHECK", ActionId.WAIT_FOR_BLOCKERS);
                A2Z = type158;
                Type type159 = new Type("MIB_THREAD_VIEW_ENTRY_POINT", ActionId.NOTIFY_SUBSCRIBERS);
                A2k = type159;
                Type type160 = new Type("MIB_HAS_OPTED_IN_ENCRYPTED_BACKUP", ActionId.FAIL_FILE_TOO_LARGE);
                A2e = type160;
                Type type161 = new Type("MIB_HAS_OPTED_OUT_ENCRYPTED_BACKUP", ActionId.OFFLINE);
                A2f = type161;
                Type type162 = new Type("MIB_HAS_SHOWN_EB_ONBOARDING", ActionId.ASNYC_FAILED);
                A2g = type162;
                Type type163 = new Type("MIB_NOT_ENTRY_POINT", ActionId.ASYNC_FAIL);
                A2i = type163;
                Type type164 = new Type("MIB_SAME_PROFILE_IN_MESSENGER_APP", ActionId.ON_ATTACH_FRAGMENT);
                A2j = type164;
                Type type165 = new Type("MIB_CHECK_FRIENDSHIP_STATUS_WITH_ONE_TO_ONE_THREAD_PARTICIPANT", ActionId.VIEW_DID_APPEAR_BEGIN);
                A2b = type165;
                Type type166 = new Type("MIB_CHECK_IF_USER_HAS_EXCHANGED_MESSAGES", ActionId.DISPLAYED);
                A2c = type166;
                Type type167 = new Type("MIB_CHECK_THREAD_TYPE", ActionId.DISPLAYED_ON_SCREEN);
                A2d = type167;
                Type type168 = new Type("MIB_CAN_FRIEND_REQUEST_ONE_ON_ONE_THREAD_PARTICIPANT", ActionId.ASYNC_ACTION_SUCCESS);
                A2a = type168;
                Type type169 = new Type("MIB_MESSAGING_CONNECTIONS_FRIENDING_QP", ActionId.ASYNC_ACTION_FAIL);
                A2h = type169;
                Type type170 = new Type("MESSENGER_LWI_AD_CREATION", ActionId.CONNECTIVITY_CHANGED);
                A1y = type170;
                Type type171 = new Type("MESSENGER_BUSINESS_SMCTA_BOOST_POST_UPSELL_TARGET_THREAD", ActionId.VIDEO_DISPLAYED);
                A1h = type171;
                Type type172 = new Type("MESSENGER_THREAD_IS_BUMPED", ActionId.VIDEO_REQUESTED_PLAYING);
                A2B = type172;
                Type type173 = new Type("MESSENGER_THREAD_CONTAINS_MESSENGER_BLOCKED_CONTACT", 172);
                A28 = type173;
                Type type174 = new Type("MESSENGER_GROUP_THREAD_IS_VIEWER_ADMIN", 173);
                A1u = type174;
                Type type175 = new Type("MESSENGER_GROUP_THREAD_IS_VIEWER_GROUP_CREATOR", 174);
                A1v = type175;
                Type type176 = new Type("MESSENGER_ARMADILLO_GROUP_THREAD_GROUP_MEMBER_ADD_MODE", 175);
                A1g = type176;
                Type type177 = new Type("MESSENGER_ANDROID_RESTRICTED_MODE_ENABLED", 176);
                A1e = type177;
                Type type178 = new Type("MESSENGER_ANDROID_IS_IGNORING_BATTERY_OPTIMIZATIONS", 177);
                A1d = type178;
                Type type179 = new Type("MESSENGER_ANDROID_WAS_CRASHED", 178);
                A1f = type179;
                Type type180 = new Type("MESSENGER_CHECK_NOTIFICATION_PERMISSION", 179);
                A1m = type180;
                Type type181 = new Type("MESSENGER_CHECK_NOTIFICATION_CHANNEL_MUTED", 180);
                A1l = type181;
                Type type182 = new Type("MESSENGER_CHECK_CHAT_HEAD_FEATURE_ENABLED", 181);
                A1j = type182;
                Type type183 = new Type("MESSENGER_CHECK_OVERLAY_PERMISSION", 182);
                A1n = type183;
                Type type184 = new Type("MESSENGER_INBOX_BULK_THREAD_DELETION", 183);
                A1x = type184;
                Type type185 = new Type("MESSENGER_USER_HAS_UNREAD_SORT_ON", 184);
                A2R = type185;
                Type type186 = new Type("USER_ACCOUNT_NUX_NOT_COMPLETED", 185);
                A3d = type186;
                Type type187 = new Type("PRELOADS_DISCLAIMER", 186);
                A37 = type187;
                Type type188 = new Type("PRELOADS_DISCLAIMER_MESSENGER", 187);
                A38 = type188;
                Type type189 = new Type("PRELOADS_UPDATE_OVER_CELLULAR", 188);
                A39 = type189;
                Type type190 = new Type("PRELOADS_UPDATE_OWNERSHIP", 189);
                A3A = type190;
                Type type191 = new Type("MESSENGER_THREAD_IS_ELIGIBLE_FOR_ROLL_CALL_CREATION", 190);
                A2E = type191;
                Type type192 = new Type("MESSENGER_THREAD_IS_ELIGIBLE_FOR_AI_SUMMONING", 191);
                A2D = type192;
                Type type193 = new Type("MESSENGER_USER_IS_ELIGIBLE_FOR_CHANNELS_POLLS_UPSELL", 192);
                A2S = type193;
                Type type194 = new Type("MESSENGER_USER_IS_ELIGIBLE_FOR_PIN_CHANNEL_IN_PERSONAL_INBOX", 193);
                A2U = type194;
                Type type195 = new Type("MESSENGER_USER_IS_ELIGIBLE_FOR_WAITLIST_QP", 194);
                A2V = type195;
                Type type196 = new Type("MESSENGER_USER_IS_ELIGIBLE_FOR_OFF_WAITLIST_QP", 195);
                A2T = type196;
                Type type197 = new Type("NXX_LOCATION_SERVICE_CLIENT", 196);
                A2u = type197;
                Type type198 = new Type("DELAY_IMPRESSIONS_PER_MESSENGER_THREAD_BY_TIME", 197);
                A0f = type198;
                Type type199 = new Type("SGF_DELAY_IMPRESSIONS_PER_MESSENGER_THREAD_BY_TIME", 198);
                A3P = type199;
                Type type200 = new Type("GROUP_CHAT_UPGRADE_ELIGIBLE", 199);
                A12 = type200;
                Type type201 = new Type("MESSENGER_THREAD_IS_PAUSED", 200);
                A2G = type201;
                Type type202 = new Type("MESSENGER_THREAD_IS_UPGRADED_COMMUNITY_JOINED", 201);
                A2I = type202;
                Type type203 = new Type("MESSENGER_THREAD_IS_UPGRADED_COMMUNITY_OWNER", 202);
                A2J = type203;
                Type type204 = new Type("FBM_E2EE_LOCAL_MEDIA_MIN_STORAGE_USAGE", 203);
                A0o = type204;
                Type type205 = new Type("IS_FB_OS_PUSH_NOTIFICATION_DISABLED", 204);
                A1E = type205;
                Type type206 = new Type("FB4A_A13_PUSH_NOTIFICATION", 205);
                A0m = type206;
                Type type207 = new Type("IS_FB_WIDGET_NOT_INSTALLED", 206);
                A1F = type207;
                Type type208 = new Type("FBM_E2EE_MESSAGE_EXPIRATION_LOW_STORAGE_MODE_ON", 207);
                A0q = type208;
                Type type209 = new Type("ACCOUNT_RECOVERY_SUCCESS", 208);
                A03 = type209;
                Type type210 = new Type("SAVE_PASSWORD_INTERSTITIAL", 209);
                A3I = type210;
                Type type211 = new Type("FB_LINK_SHARING_IMPRESSION_FILTER", 210);
                A0w = type211;
                Type type212 = new Type("FBM_E2EE_MESSAGE_EXPIRATION_DAYS_SINCE_CUTOVER", 211);
                A0p = type212;
                Type type213 = new Type("MESSENGER_CHECK_FRIENDSHIP_STATUS_WITH_ONE_TO_ONE_THREAD_PARTICIPANT", 212);
                A1k = type213;
                Type type214 = new Type("MESSENGER_FRIENDING_CONTENT_INTERPOLATION_AVAILABLE", 213);
                A1t = type214;
                Type type215 = new Type("MESSENGER_VIEWER_MESSAGE_COUNT_GREATER_OR_EQUAL", 214);
                A2X = type215;
                Type type216 = new Type("MESSENGER_RECIPIENT_MESSAGE_COUNT_GREATER_OR_EQUAL", 215);
                A25 = type216;
                Type type217 = new Type("PROFILE_PICTURE_UPLOAD", 216);
                A3B = type217;
                Type type218 = new Type("NOTIFICATION_TURN_ON_RESNUX", 217);
                A2s = type218;
                Type type219 = new Type("FBM_E2EE_MESSAGE_EXPIRATION_MAX_DEVICE_STORAGE_USAGE", 218);
                A0r = type219;
                Type type220 = new Type("FBM_E2EE_MESSAGE_EXPIRATION_MIN_DEVICE_STORAGE_USAGE", 219);
                A0s = type220;
                Type type221 = new Type("FB_ACTIVE_STATUS_SETTING_ENABLED", 220);
                A0t = type221;
                Type type222 = new Type("IS_FB4A_LOCATION_SERVICE_DENIED", 221);
                A1D = type222;
                Type type223 = new Type("FB4A_LOCATION_IS_NOT_GRANTED_OR_NEVER_ASK_AGAIN", 222);
                A0n = type223;
                Type type224 = new Type("LOGIN_MIS_AUTH_MEASUREMENT", 223);
                A1V = type224;
                Type type225 = new Type("NUX_WIZARD_COMPLETED", 224);
                A2t = type225;
                Type type226 = new Type("RESNXX_XOUT", 225);
                A3G = type226;
                Type type227 = new Type("HAS_SEEN_PROMOTION_ON_CURRENT_APP_INSTALL", 226);
                A15 = type227;
                Type type228 = new Type("SHOW_AUTO_CONF_CONSENT_LOGGED_IN", 227);
                A3Q = type228;
                Type type229 = new Type(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 228);
                A3b = type229;
                Type[] typeArr = new Type[229];
                System.arraycopy(new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27}, 0, typeArr, 0, 27);
                System.arraycopy(new Type[]{type28, type29, type30, type31, type32, type33, type34, type35, type36, type37, type38, type39, type40, type41, type42, type43, type44, type45, type46, type47, type48, type49, type50, type51, type52, type53, type54}, 0, typeArr, 27, 27);
                System.arraycopy(new Type[]{type55, type56, type57, type58, type59, type60, type61, type62, type63, type64, type65, type66, type67, type68, type69, type70, type71, type72, type73, type74, type75, type76, type77, type78, type79, type80, type81}, 0, typeArr, 54, 27);
                System.arraycopy(new Type[]{type82, type83, type84, type85, type86, type87, type88, type89, type90, type91, type92, type93, type94, type95, type96, type97, type98, type99, type100, type101, type102, type103, type104, type105, type106, type107, type108}, 0, typeArr, 81, 27);
                System.arraycopy(new Type[]{type109, type110, type111, type112, type113, type114, type115, type116, type117, type118, type119, type120, type121, type122, type123, type124, type125, type126, type127, type128, type129, type130, type131, type132, type133, type134, type135}, 0, typeArr, 108, 27);
                System.arraycopy(new Type[]{type136, type137, type138, type139, type140, type141, type142, type143, type144, type145, type146, type147, type148, type149, type150, type151, type152, type153, type154, type155, type156, type157, type158, type159, type160, type161, type162}, 0, typeArr, ActionId.MQTT_CONNECTING, 27);
                System.arraycopy(new Type[]{type163, type164, type165, type166, type167, type168, type169, type170, type171, type172, type173, type174, type175, type176, type177, type178, type179, type180, type181, type182, type183, type184, type185, type186, type187, type188, type189}, 0, typeArr, ActionId.ASYNC_FAIL, 27);
                System.arraycopy(new Type[]{type190, type191, type192, type193, type194, type195, type196, type197, type198, type199, type200, type201, type202, type203, type204, type205, type206, type207, type208, type209, type210, type211, type212, type213, type214, type215, type216}, 0, typeArr, 189, 27);
                System.arraycopy(new Type[]{type217, type218, type219, type220, type221, type222, type223, type224, type225, type226, type227, type228, type229}, 0, typeArr, 216, 13);
                A02 = typeArr;
                A01 = C00t.A00(typeArr);
                A00 = new Object();
            }

            public Type(String str, int i) {
            }

            public static final Type fromString(String str) {
                return A00.fromString(str);
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) A02.clone();
            }
        }

        public ContextualFilter() {
            this.type = Type.A3b;
            this.passIfNotSupported = false;
            this.value = "";
            this.extraData = 04R.A0G();
        }

        public ContextualFilter(Parcel parcel) {
            String readString = parcel.readString();
            if (readString == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            this.type = Type.valueOf(readString);
            this.passIfNotSupported = parcel.readByte() != 1 ? false : true;
            String readString2 = parcel.readString();
            if (readString2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            this.value = readString2;
            HashMap A0u = AnonymousClass001.A0u();
            parcel.readMap(A0u, Map.class.getClassLoader());
            ImmutableMap copyOf = ImmutableMap.copyOf((Map) A0u);
            11T.A0A(copyOf);
            this.extraData = copyOf;
        }

        public ContextualFilter(Type type, String str, Map map, boolean z) {
            11T.A0F(type, 1);
            this.type = type;
            this.passIfNotSupported = z;
            this.value = str;
            ImmutableMap copyOf = ImmutableMap.copyOf(map);
            11T.A0A(copyOf);
            this.extraData = copyOf;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            1BL.A12(parcel, this.type);
            parcel.writeByte(this.passIfNotSupported ? (byte) 1 : (byte) 0);
            parcel.writeString(this.value);
            parcel.writeMap(this.extraData);
        }
    }

    /* loaded from: QuickPromotionDefinition$Creative.class */
    public final class Creative implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C4Ny(45);
        public final ImageParameters animatedImageParams;
        public final ImageParameters brandingImageParams;
        public final ImmutableList bulletList;
        public final String content;
        public final Action dismissAction;
        public final String footer;
        public final ImageParameters imageParams;
        public final Action primaryAction;
        public final Action secondaryAction;
        public final SocialContext socialContext;
        public final TemplateType template;
        public final ImmutableMap templateParameters;
        public final String title;

        public Creative() {
            this.title = null;
            this.content = null;
            this.imageParams = null;
            this.animatedImageParams = null;
            this.primaryAction = null;
            this.secondaryAction = null;
            this.dismissAction = null;
            this.socialContext = null;
            this.footer = null;
            this.template = TemplateType.A0x;
            ImmutableMap immutableMap = RegularImmutableMap.A03;
            11T.A0A(immutableMap);
            this.templateParameters = immutableMap;
            this.brandingImageParams = null;
            this.bulletList = 1BK.A0b();
        }

        public Creative(Parcel parcel) {
            this.title = parcel.readString();
            this.content = parcel.readString();
            this.imageParams = (ImageParameters) 1BL.A0C(parcel, ImageParameters.class);
            this.animatedImageParams = (ImageParameters) 1BL.A0C(parcel, ImageParameters.class);
            this.primaryAction = (Action) 1BL.A0C(parcel, Action.class);
            this.secondaryAction = (Action) 1BL.A0C(parcel, Action.class);
            this.dismissAction = (Action) 1BL.A0C(parcel, Action.class);
            this.socialContext = (SocialContext) 1BL.A0C(parcel, SocialContext.class);
            this.footer = parcel.readString();
            this.template = TemplateType.A00.fromString(parcel.readString());
            ImmutableMap copyOf = ImmutableMap.copyOf((Map) parcel.readHashMap(null));
            11T.A0A(copyOf);
            this.templateParameters = copyOf;
            this.brandingImageParams = (ImageParameters) 1BL.A0C(parcel, ImageParameters.class);
            ArrayList A0s = AnonymousClass001.A0s();
            parcel.readTypedList(A0s, BulletListItem.CREATOR);
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A0s);
            11T.A0A(copyOf2);
            this.bulletList = copyOf2;
        }

        public Creative(Action action, Action action2, Action action3, ImageParameters imageParameters, ImageParameters imageParameters2, ImageParameters imageParameters3, SocialContext socialContext, TemplateType templateType, ImmutableMap immutableMap, String str, String str2, String str3) {
            11T.A0F(immutableMap, 11);
            this.title = str;
            this.content = str2;
            this.imageParams = imageParameters;
            this.animatedImageParams = imageParameters2;
            this.primaryAction = action;
            this.secondaryAction = action2;
            this.dismissAction = action3;
            this.socialContext = socialContext;
            this.footer = str3;
            this.template = templateType == null ? TemplateType.A0x : templateType;
            this.templateParameters = immutableMap;
            this.brandingImageParams = imageParameters3;
            ImmutableList of = ImmutableList.of();
            11T.A0A(of);
            this.bulletList = of;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeString(this.title);
            parcel.writeString(this.content);
            parcel.writeParcelable(this.imageParams, i);
            parcel.writeParcelable(this.animatedImageParams, i);
            parcel.writeParcelable(this.primaryAction, i);
            parcel.writeParcelable(this.secondaryAction, i);
            parcel.writeParcelable(this.dismissAction, i);
            parcel.writeParcelable(this.socialContext, i);
            parcel.writeString(this.footer);
            TemplateType templateType = this.template;
            if (templateType == null) {
                templateType = TemplateType.A0x;
            }
            1BL.A12(parcel, templateType);
            parcel.writeMap(this.templateParameters);
            parcel.writeParcelable(this.brandingImageParams, i);
            parcel.writeList(this.bulletList);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: QuickPromotionDefinition$FBBooleanType.class */
    public final class FBBooleanType {
        public static final Companion A00;
        public static final /* synthetic */ EnumEntries A01;
        public static final /* synthetic */ FBBooleanType[] A02;
        public static final FBBooleanType A03;
        public static final FBBooleanType A04;
        public static final FBBooleanType A05;
        public static final FBBooleanType A06;
        public final C43g sdkType;

        /* loaded from: QuickPromotionDefinition$FBBooleanType$Companion.class */
        public final class Companion {
            public final FBBooleanType fromString(String str) {
                C43g c43g;
                try {
                    if (str == null) {
                        c43g = C43g.A05;
                    } else {
                        Locale locale = Locale.US;
                        11T.A0B(locale);
                        String upperCase = str.toUpperCase(locale);
                        11T.A0A(upperCase);
                        c43g = C43g.valueOf(upperCase);
                    }
                } catch (IllegalArgumentException unused) {
                    c43g = C43g.A05;
                }
                int ordinal = c43g.ordinal();
                if (ordinal == 0) {
                    return FBBooleanType.A03;
                }
                if (ordinal == 1) {
                    return FBBooleanType.A05;
                }
                if (ordinal == 2) {
                    return FBBooleanType.A04;
                }
                if (ordinal == 3) {
                    return FBBooleanType.A06;
                }
                throw new RuntimeException();
            }
        }

        /* JADX WARN: Type inference failed for: r0v21, types: [com.facebook.quickpromotion.model.QuickPromotionDefinition$FBBooleanType$Companion, java.lang.Object] */
        static {
            FBBooleanType fBBooleanType = new FBBooleanType(C43g.A02, "AND", 0);
            A03 = fBBooleanType;
            FBBooleanType fBBooleanType2 = new FBBooleanType(C43g.A04, "OR", 1);
            A05 = fBBooleanType2;
            FBBooleanType fBBooleanType3 = new FBBooleanType(C43g.A03, "NOR", 2);
            A04 = fBBooleanType3;
            FBBooleanType fBBooleanType4 = new FBBooleanType(C43g.A05, OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 3);
            A06 = fBBooleanType4;
            FBBooleanType[] fBBooleanTypeArr = {fBBooleanType, fBBooleanType2, fBBooleanType3, fBBooleanType4};
            A02 = fBBooleanTypeArr;
            A01 = C00t.A00(fBBooleanTypeArr);
            A00 = new Object();
        }

        public FBBooleanType(C43g c43g, String str, int i) {
            this.sdkType = c43g;
        }

        public static final FBBooleanType fromString(String str) {
            return A00.fromString(str);
        }

        public static FBBooleanType valueOf(String str) {
            return (FBBooleanType) Enum.valueOf(FBBooleanType.class, str);
        }

        public static FBBooleanType[] values() {
            return (FBBooleanType[]) A02.clone();
        }
    }

    /* loaded from: QuickPromotionDefinition$FilterClause.class */
    public final class FilterClause implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C4Ny(46);
        public final ImmutableList clauses;
        public final ImmutableList filters;
        public final FBBooleanType type;

        public FilterClause() {
            this.type = FBBooleanType.A06;
            this.filters = 1BK.A0b();
            this.clauses = 1BK.A0b();
        }

        public FilterClause(Parcel parcel) {
            this.type = FBBooleanType.A00.fromString(parcel.readString());
            ArrayList A0s = AnonymousClass001.A0s();
            parcel.readTypedList(A0s, ContextualFilter.CREATOR);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0s);
            11T.A0A(copyOf);
            this.filters = copyOf;
            ArrayList A0s2 = AnonymousClass001.A0s();
            parcel.readTypedList(A0s2, CREATOR);
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A0s2);
            11T.A0A(copyOf2);
            this.clauses = copyOf2;
        }

        public FilterClause(FBBooleanType fBBooleanType, List list, List list2) {
            11T.A0F(fBBooleanType, 1);
            this.type = fBBooleanType;
            ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
            11T.A0A(copyOf);
            this.filters = copyOf;
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) list2);
            11T.A0A(copyOf2);
            this.clauses = copyOf2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            1BL.A12(parcel, this.type);
            parcel.writeTypedList(this.filters);
            parcel.writeTypedList(this.clauses);
        }
    }

    /* loaded from: QuickPromotionDefinition$ImageParameters.class */
    public final class ImageParameters implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C4Ny(47);
        public final int height;
        public final String name;
        public final float scale;
        public final String uri;
        public final int width;

        public ImageParameters() {
            this.uri = null;
            this.width = 0;
            this.height = 0;
            this.scale = 0.0f;
            this.name = null;
        }

        public ImageParameters(Parcel parcel) {
            this.uri = parcel.readString();
            this.width = parcel.readInt();
            this.height = parcel.readInt();
            this.scale = parcel.readFloat();
            this.name = parcel.readString();
        }

        public ImageParameters(String str, float f, int i, int i2) {
            this.uri = str;
            this.width = i;
            this.height = i2;
            this.scale = f;
            this.name = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeString(this.uri);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            parcel.writeFloat(this.scale);
            parcel.writeString(this.name);
        }
    }

    /* loaded from: QuickPromotionDefinition$SocialContext.class */
    public final class SocialContext implements Parcelable {
        public static final Parcelable.Creator CREATOR = new FKW(74);
        public final ImmutableList friendIds;
        public final String text;

        public SocialContext() {
            this.text = "";
            this.friendIds = 1BK.A0b();
        }

        public SocialContext(Parcel parcel) {
            String readString = parcel.readString();
            if (readString == null) {
                throw 1BK.A0h();
            }
            this.text = readString;
            ImmutableList copyOf = ImmutableList.copyOf((Collection) parcel.createStringArrayList());
            11T.A0A(copyOf);
            this.friendIds = copyOf;
        }

        public SocialContext(ImmutableList immutableList, String str) {
            this.text = str == null ? "" : str;
            this.friendIds = immutableList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeString(this.text);
            parcel.writeStringList(this.friendIds);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: QuickPromotionDefinition$TemplateType.class */
    public final class TemplateType {
        public static final Companion A00;
        public static final /* synthetic */ EnumEntries A01;
        public static final /* synthetic */ TemplateType[] A02;
        public static final TemplateType A03;
        public static final TemplateType A04;
        public static final TemplateType A05;
        public static final TemplateType A06;
        public static final TemplateType A07;
        public static final TemplateType A08;
        public static final TemplateType A09;
        public static final TemplateType A0A;
        public static final TemplateType A0B;
        public static final TemplateType A0C;
        public static final TemplateType A0D;
        public static final TemplateType A0E;
        public static final TemplateType A0F;
        public static final TemplateType A0G;
        public static final TemplateType A0H;
        public static final TemplateType A0I;
        public static final TemplateType A0J;
        public static final TemplateType A0K;
        public static final TemplateType A0L;
        public static final TemplateType A0M;
        public static final TemplateType A0N;
        public static final TemplateType A0O;
        public static final TemplateType A0P;
        public static final TemplateType A0Q;
        public static final TemplateType A0R;
        public static final TemplateType A0S;
        public static final TemplateType A0T;
        public static final TemplateType A0U;
        public static final TemplateType A0V;
        public static final TemplateType A0W;
        public static final TemplateType A0X;
        public static final TemplateType A0Y;
        public static final TemplateType A0Z;
        public static final TemplateType A0a;
        public static final TemplateType A0b;
        public static final TemplateType A0c;
        public static final TemplateType A0d;
        public static final TemplateType A0e;
        public static final TemplateType A0f;
        public static final TemplateType A0g;
        public static final TemplateType A0h;
        public static final TemplateType A0i;
        public static final TemplateType A0j;
        public static final TemplateType A0k;
        public static final TemplateType A0l;
        public static final TemplateType A0m;
        public static final TemplateType A0n;
        public static final TemplateType A0o;
        public static final TemplateType A0p;
        public static final TemplateType A0q;
        public static final TemplateType A0r;
        public static final TemplateType A0s;
        public static final TemplateType A0t;
        public static final TemplateType A0u;
        public static final TemplateType A0v;
        public static final TemplateType A0w;
        public static final TemplateType A0x;
        public static final TemplateType A0y;
        public static final TemplateType A0z;

        /* loaded from: QuickPromotionDefinition$TemplateType$Companion.class */
        public final class Companion {
            public final TemplateType fromString(String str) {
                try {
                    if (str == null) {
                        return TemplateType.A0x;
                    }
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    11T.A0A(upperCase);
                    return TemplateType.valueOf(upperCase);
                } catch (IllegalArgumentException unused) {
                    return TemplateType.A0x;
                }
            }
        }

        /* JADX WARN: Type inference failed for: r0v260, types: [com.facebook.quickpromotion.model.QuickPromotionDefinition$TemplateType$Companion, java.lang.Object] */
        static {
            TemplateType templateType = new TemplateType("ANDROID_FOOTER", 0);
            A03 = templateType;
            TemplateType templateType2 = new TemplateType("ANDROID_WIDE_FOOTER", 1);
            A0E = templateType2;
            TemplateType templateType3 = new TemplateType("FEED_PYMK", 2);
            A0R = templateType3;
            TemplateType templateType4 = new TemplateType("INTERSTITIAL_1_BUTTON_X", 3);
            A0U = templateType4;
            TemplateType templateType5 = new TemplateType("INTERSTITIAL_2_BUTTON", 4);
            A0V = templateType5;
            TemplateType templateType6 = new TemplateType("ANDROID_MESSAGES_INTERSTITIAL_2_BUTTON", 5);
            A04 = templateType6;
            TemplateType templateType7 = new TemplateType("CARD", 6);
            A0H = templateType7;
            TemplateType templateType8 = new TemplateType("CARD_WITH_HEADER", 7);
            A0I = templateType8;
            TemplateType templateType9 = new TemplateType("FIG_DIALOG", 8);
            A0S = templateType9;
            TemplateType templateType10 = new TemplateType("MESSAGING_IN_BLUE_THREAD_LIST_HEADER_BANNER", 9);
            A0Z = templateType10;
            TemplateType templateType11 = new TemplateType("MESSAGING_IN_BLUE_THREAD_VIEW_HEADER_BANNER", 10);
            A0a = templateType11;
            TemplateType templateType12 = new TemplateType("MESSAGING_IN_BLUE_FULLSCREEN_CENTER_ALIGN_IMAGE_INTERSTITIAL", 11);
            A0X = templateType12;
            TemplateType templateType13 = new TemplateType("MESSAGING_IN_BLUE_FULLSCREEN_INTERSTITIAL", 12);
            A0Y = templateType13;
            TemplateType templateType14 = new TemplateType("MESSENGER_CARD", 13);
            A0d = templateType14;
            TemplateType templateType15 = new TemplateType("MESSENGER_CARD_NO_BADGE", 14);
            A0e = templateType15;
            TemplateType templateType16 = new TemplateType("SEARCH_NULL_STATE_MEGAPHONE", 15);
            A0r = templateType16;
            TemplateType templateType17 = new TemplateType("SEARCH_BAR_TOOLTIP", 16);
            A0q = templateType17;
            TemplateType templateType18 = new TemplateType("FACEBOOK_TOOLTIP", 17);
            A0P = templateType18;
            TemplateType templateType19 = new TemplateType("FACEBOOK_BOTTOM_SHEET_BLOKS", 18);
            A0N = templateType19;
            TemplateType templateType20 = new TemplateType("MESSENGER_NEUE_NUX_INTERSTITIAL", 19);
            A0i = templateType20;
            TemplateType templateType21 = new TemplateType("MESSENGER_CHAT_ENTITY_STANDARD", 20);
            A0f = templateType21;
            TemplateType templateType22 = new TemplateType("MESSENGER_LIGHTSPEED_THREAD_VIEW_HEADER_FEEDBACK_BANNER", 21);
            A0g = templateType22;
            TemplateType templateType23 = new TemplateType("MESSENGER_ANDROID_THREAD_LIST_BANNER_WITHOUT_COLOR_EMPHASIS_TEMPLATE", 22);
            A0b = templateType23;
            TemplateType templateType24 = new TemplateType("ANDROID_MESSENGER_INTERSTITIAL_MDS", 23);
            A06 = templateType24;
            TemplateType templateType25 = new TemplateType("ANDROID_MESSENGER_INTERSTITIAL_BULLET_LIST", 24);
            A05 = templateType25;
            TemplateType templateType26 = new TemplateType("ANDROID_MESSENGER_THREAD_LIST_HEADER_BANNER", 25);
            A08 = templateType26;
            TemplateType templateType27 = new TemplateType("ANDROID_MESSENGER_THREAD_LIST_HEADER_BUTTONLESS_BANNER", 26);
            A09 = templateType27;
            TemplateType templateType28 = new TemplateType("ANDROID_MESSENGER_THREAD_VIEW_HEADER_BANNER", 27);
            A0C = templateType28;
            TemplateType templateType29 = new TemplateType("ANDROID_MESSENGER_THREAD_VIEW_HEADER_BUTTONLESS_BANNER", 28);
            A0D = templateType29;
            TemplateType templateType30 = new TemplateType("ANDROID_MESSENGER_THREAD_VIEW_COMPOSER_BANNER", 29);
            A0A = templateType30;
            TemplateType templateType31 = new TemplateType("ANDROID_MESSENGER_THREAD_VIEW_COMPOSER_BUTTONLESS_BANNER", 30);
            A0B = templateType31;
            TemplateType templateType32 = new TemplateType("ANDROID_MESSENGER_RTC_PEEK_PROMOTION", 31);
            A07 = templateType32;
            TemplateType templateType33 = new TemplateType("MESSAGES_EMBEDDED_INTERSTITIAL", 32);
            A0W = templateType33;
            TemplateType templateType34 = new TemplateType("BRANDED_MEGAPHONE", 33);
            A0G = templateType34;
            TemplateType templateType35 = new TemplateType("SURVEY_MEGAPHONE", 34);
            A0u = templateType35;
            TemplateType templateType36 = new TemplateType("BLAST_MEGAPHONE", 35);
            A0F = templateType36;
            TemplateType templateType37 = new TemplateType("CUSTOM_RENDERED", 36);
            A0L = templateType37;
            TemplateType templateType38 = new TemplateType("PROFILE_TIMELINE", 37);
            A0p = templateType38;
            TemplateType templateType39 = new TemplateType("COMPOSER_TOOLTIP", 38);
            A0K = templateType39;
            TemplateType templateType40 = new TemplateType("TAB_PROMOTION", 39);
            A0v = templateType40;
            TemplateType templateType41 = new TemplateType("TAB_PROMOTION_SINGLE_ENTITY", 40);
            A0w = templateType41;
            TemplateType templateType42 = new TemplateType("STATIC_TAB_PROMOTION", 41);
            A0t = templateType42;
            TemplateType templateType43 = new TemplateType("SIMPLE_TAB_PROMOTION", 42);
            A0s = templateType43;
            TemplateType templateType44 = new TemplateType("EMBEDDED_SURVEY_MEGAPHONE", 43);
            A0M = templateType44;
            TemplateType templateType45 = new TemplateType("WORDMARK", 44);
            A0y = templateType45;
            TemplateType templateType46 = new TemplateType("WORKPLACE_TOOLTIP", 45);
            A0z = templateType46;
            TemplateType templateType47 = new TemplateType("MESSENGER_ME_SETTINGS_BANNER", 46);
            A0h = templateType47;
            TemplateType templateType48 = new TemplateType("MESSENGER_SUB_SETTINGS_BANNER", 47);
            A0j = templateType48;
            TemplateType templateType49 = new TemplateType("COMMUNITY_NATIVE_BOTTOM_SHEET", 48);
            A0J = templateType49;
            TemplateType templateType50 = new TemplateType("MESSENGER_BOTTOM_SHEET_BULLET_LIST_BLOKS", 49);
            A0c = templateType50;
            TemplateType templateType51 = new TemplateType("FACEBOOK_CONTEXTUAL_MESSAGE", 50);
            A0O = templateType51;
            TemplateType templateType52 = new TemplateType("GROUP_MALL_ENTITY_MENU_AUTO_OPEN", 51);
            A0T = templateType52;
            TemplateType templateType53 = new TemplateType("NEW_ACCOUNT_BLOKS_ROOT_ACTION", 52);
            A0l = templateType53;
            TemplateType templateType54 = new TemplateType("PRELOADS_DISCLAIMER", 53);
            A0n = templateType54;
            TemplateType templateType55 = new TemplateType("PRELOADS_UPDATE_OWNERSHIP_TEMPLATE", 54);
            A0o = templateType55;
            TemplateType templateType56 = new TemplateType("NOTIFICATION_PERMISSION_PROMPT", 55);
            A0m = templateType56;
            TemplateType templateType57 = new TemplateType("META_AI_INTERSTITIAL_NATIVE_CUSTOM", 56);
            A0k = templateType57;
            TemplateType templateType58 = new TemplateType("FB_META_AI_INTERSTITIAL_NATIVE_CUSTOM", 57);
            A0Q = templateType58;
            TemplateType templateType59 = new TemplateType(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 58);
            A0x = templateType59;
            TemplateType[] templateTypeArr = new TemplateType[59];
            System.arraycopy(new TemplateType[]{templateType, templateType2, templateType3, templateType4, templateType5, templateType6, templateType7, templateType8, templateType9, templateType10, templateType11, templateType12, templateType13, templateType14, templateType15, templateType16, templateType17, templateType18, templateType19, templateType20, templateType21, templateType22, templateType23, templateType24, templateType25, templateType26, templateType27}, 0, templateTypeArr, 0, 27);
            System.arraycopy(new TemplateType[]{templateType28, templateType29, templateType30, templateType31, templateType32, templateType33, templateType34, templateType35, templateType36, templateType37, templateType38, templateType39, templateType40, templateType41, templateType42, templateType43, templateType44, templateType45, templateType46, templateType47, templateType48, templateType49, templateType50, templateType51, templateType52, templateType53, templateType54}, 0, templateTypeArr, 27, 27);
            System.arraycopy(new TemplateType[]{templateType55, templateType56, templateType57, templateType58, templateType59}, 0, templateTypeArr, 54, 5);
            A02 = templateTypeArr;
            A01 = C00t.A00(templateTypeArr);
            A00 = new Object();
        }

        public TemplateType(String str, int i) {
        }

        public static final TemplateType fromString(String str) {
            return A00.fromString(str);
        }

        public static TemplateType valueOf(String str) {
            return (TemplateType) Enum.valueOf(TemplateType.class, str);
        }

        public static TemplateType[] values() {
            return (TemplateType[]) A02.clone();
        }
    }

    public QuickPromotionDefinition() {
        this.A02 = 1BK.A0b();
        RegularImmutableSet regularImmutableSet = RegularImmutableSet.A05;
        11T.A0A(regularImmutableSet);
        this.A01 = regularImmutableSet;
        this.promotionId = "";
        this.triggers = 1BK.A0b();
        this.testCreatives = 1BK.A0b();
        this.filters = 1BK.A0b();
        this.animations = 1BK.A0b();
        this.booleanFilter = null;
        this.title = null;
        this.content = null;
        this.imageParams = null;
        this.animatedImageParams = null;
        this.primaryAction = null;
        this.secondaryAction = null;
        this.dismissAction = null;
        this.socialContext = null;
        this.footer = null;
        this.template = TemplateType.A0x;
        ImmutableMap immutableMap = RegularImmutableMap.A03;
        11T.A0A(immutableMap);
        this.templateParameters = immutableMap;
        this.priority = 0L;
        this.maxImpressions = 0;
        this.viewerImpressions = -1;
        this.startTime = 0L;
        this.endTime = 0L;
        this.clientTtlSeconds = 0L;
        this.instanceLogData = immutableMap;
        this.A03 = null;
        this.isExposureHoldout = false;
        this.logEligibilityWaterfall = false;
        this.brandingImageParams = null;
        this.customRenderType = CustomRenderType.A0g;
        this.customRenderParams = immutableMap;
        this.A04 = false;
        this.bulletList = ImmutableList.of();
        this.clientSideDryRun = false;
    }

    public QuickPromotionDefinition(2xC r302) {
        ImmutableList of;
        BooleanFilter booleanFilter;
        SocialContext socialContext;
        ImmutableMap immutableMap;
        ImmutableList of2;
        String A0r;
        String A0r2;
        ImmutableList of3 = ImmutableList.of();
        11T.A0A(of3);
        this.A02 = of3;
        RegularImmutableSet regularImmutableSet = RegularImmutableSet.A05;
        11T.A0A(regularImmutableSet);
        this.A01 = regularImmutableSet;
        2JX A0u = r302.A0u();
        if (A0u != null) {
            ImmutableList A0c = A0u.A0c(598509220, 2JX.class, -206750890);
            if (!A0c.isEmpty()) {
                2JX r0 = (2JX) A0c.get(0);
                this.A00 = r302;
                String A0r3 = A0u.A0r(1962741303);
                this.promotionId = A0r3 == null ? "" : A0r3;
                ImmutableList.Builder builder = ImmutableList.builder();
                1Du it = A0u.A0Z(1503093179).iterator();
                while (it.hasNext()) {
                    InterstitialTrigger A00 = InterstitialTrigger.A03.A00((String) it.next());
                    if (A00 != null) {
                        builder.m11011add((Object) A00);
                    }
                }
                ImmutableList build = builder.build();
                11T.A0A(build);
                this.triggers = build;
                ImmutableList of4 = ImmutableList.of();
                11T.A0A(of4);
                this.testCreatives = of4;
                ImmutableList A2K = A0u.A2K(314070383, 1794920587);
                if (A2K == null || A2K.isEmpty()) {
                    of = ImmutableList.of();
                } else {
                    ImmutableList.Builder builder2 = new ImmutableList.Builder();
                    1Du it2 = A2K.iterator();
                    while (it2.hasNext()) {
                        2JY r02 = (2JY) it2.next();
                        GraphQLQuickPromotionAssetMode graphQLQuickPromotionAssetMode = (GraphQLQuickPromotionAssetMode) r02.A0g(GraphQLQuickPromotionAssetMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, 3357091);
                        if (graphQLQuickPromotionAssetMode != null) {
                            builder2.m11011add((Object) new Animation(r02.A0r(1415533672), graphQLQuickPromotionAssetMode.name(), r02.A0r(1315628960), r02.A0j(), r02.A0k()));
                        }
                    }
                    of = builder2.build();
                }
                11T.A0A(of);
                this.animations = of;
                this.filters = Companion.A04(A0u.A2K(1005332803, 624579355));
                2xF A0L = A0u.A0L(-1955699443, 2xF.class, -27003788);
                if (A0L == null) {
                    booleanFilter = null;
                } else {
                    ImmutableList.Builder builder3 = ImmutableList.builder();
                    1Du it3 = A0L.A0c(853680356, 2xF.class, 2016208923).iterator();
                    while (it3.hasNext()) {
                        2xF r03 = (2xF) it3.next();
                        ImmutableList.Builder builder4 = ImmutableList.builder();
                        1Du it4 = r03.A0c(853680356, 2xF.class, -847320442).iterator();
                        while (it4.hasNext()) {
                            2xF r04 = (2xF) it4.next();
                            ImmutableList.Builder builder5 = ImmutableList.builder();
                            1Du it5 = r04.A0c(853680356, 2xF.class, -1205893646).iterator();
                            while (it5.hasNext()) {
                                2xF r05 = (2xF) it5.next();
                                11T.A0D(r05);
                                builder5.m11011add((Object) Companion.A01(r05, 1BK.A0b()));
                            }
                            builder4.m11011add((Object) Companion.A01(r04, 1Fj.A01(builder5)));
                        }
                        ImmutableList build2 = builder4.build();
                        11T.A0A(build2);
                        builder3.m11011add((Object) Companion.A01(r03, build2));
                    }
                    ImmutableList build3 = builder3.build();
                    11T.A0A(build3);
                    booleanFilter = new BooleanFilter(Companion.A01(A0L, build3));
                }
                this.booleanFilter = booleanFilter;
                2JY A0L2 = r0.A0L(110371416, 2JX.class, 1834883869);
                this.title = A0L2 != null ? A0L2.A0r(3556653) : null;
                2JY A0L3 = r0.A0L(951530617, 2JX.class, 1834883869);
                this.content = A0L3 != null ? A0L3.A0r(3556653) : null;
                this.imageParams = Companion.A02(r0.A0L(-2045801427, 2JX.class, -721334811));
                this.primaryAction = Companion.A00(r0.A0L(-1862727917, 2JX.class, 265857151));
                this.secondaryAction = Companion.A00(r0.A0L(-5095583, 2JX.class, 265857151));
                this.dismissAction = Companion.A00(r0.A0L(-1406027381, 2JX.class, 265857151));
                ImmutableList A0c2 = r0.A0c(-195031284, 2JX.class, -440127646);
                11T.A0A(A0c2);
                2JY A0L4 = r0.A0L(-823445795, 2JX.class, 1834883869);
                if (A0L4 == null && A0c2.isEmpty()) {
                    socialContext = null;
                } else {
                    ImmutableList.Builder builder6 = ImmutableList.builder();
                    1Du it6 = A0c2.iterator();
                    while (it6.hasNext()) {
                        String A0k = ((2JY) it6.next()).A0k();
                        if (A0k != null) {
                            builder6.m11011add((Object) A0k);
                        }
                    }
                    socialContext = new SocialContext(1Fj.A01(builder6), A0L4 != null ? A0L4.A0i() : null);
                }
                this.socialContext = socialContext;
                2JY A0L5 = r0.A0L(-1268861541, 2JX.class, 1834883869);
                this.footer = A0L5 != null ? A0L5.A0r(3556653) : null;
                this.brandingImageParams = Companion.A02(r0.A0L(1645244183, 2JX.class, -721334811));
                this.animatedImageParams = null;
                2JX A0L6 = A0u.A0L(-1321546630, 2JX.class, 1636812173);
                if (A0L6 != null) {
                    this.template = TemplateType.A00.fromString(A0L6.A0r(3373707));
                    immutableMap = Companion.A05(A0L6.A2K(458736106, 1410044615));
                } else {
                    this.template = TemplateType.A0x;
                    immutableMap = RegularImmutableMap.A03;
                    11T.A0A(immutableMap);
                }
                this.templateParameters = immutableMap;
                this.priority = r302.getIntValue(-1165461084);
                this.maxImpressions = A0u.getIntValue(1588509999);
                this.viewerImpressions = -1;
                1I0 r06 = new 1I0(4);
                if (A0u.getBooleanValue(-1018369246)) {
                    r06.A05(Attribute.A04);
                }
                if (A0u.getBooleanValue(568171610)) {
                    r06.A05(Attribute.A03);
                }
                ImmutableSet A07 = r06.A07();
                11T.A0A(A07);
                this.A01 = A07;
                TreeJNI A0L7 = r302.A0L(1134485835, 2JX.class, 876654553);
                if (A0L7 == null) {
                    throw AnonymousClass001.A0Q("Cannot create QuickPromotionDefinition from FbQuickPromotionEdge without valid TimeRange");
                }
                this.startTime = A0L7.getTimeValue(109757538);
                this.endTime = A0L7.getTimeValue(100571);
                this.clientTtlSeconds = r302.getIntValue(-1210777416);
                ImmutableMap immutableMap2 = RegularImmutableMap.A03;
                11T.A0A(immutableMap2);
                this.instanceLogData = immutableMap2;
                this.A03 = A0u.A0r(-895082358);
                this.isExposureHoldout = r302.getBooleanValue(-1702889446);
                this.logEligibilityWaterfall = r302.getBooleanValue(-809327579);
                this.customRenderType = CustomRenderType.A00.fromString(A0u.A0r(1567100136));
                this.customRenderParams = Companion.A05(A0u.A2K(-1686912076, 1410044615));
                this.A04 = A0u.getBooleanValue(-2121565300);
                ImmutableList A2K2 = r0.A2K(-1355819589, 310645045);
                if (A2K2 == null || A2K2.isEmpty()) {
                    of2 = ImmutableList.of();
                } else {
                    ImmutableList.Builder builder7 = ImmutableList.builder();
                    1Du it7 = A2K2.iterator();
                    while (it7.hasNext()) {
                        2JY r07 = (2JY) it7.next();
                        2JY A0L8 = r07.A0L(3226745, 2JX.class, -721334811);
                        ImageParameters imageParameters = null;
                        ImageParameters imageParameters2 = (A0L8 == null || (A0r2 = A0L8.A0r(116076)) == null) ? null : new ImageParameters(A0r2, (float) A0L8.getDoubleValue(109250890), A0L8.getIntValue(113126854), A0L8.getIntValue(-1221029593));
                        2JY A0L9 = r07.A0L(-1852424286, 2JX.class, -721334811);
                        if (A0L9 != null && (A0r = A0L9.A0r(116076)) != null) {
                            imageParameters = new ImageParameters(A0r, (float) A0L9.getDoubleValue(109250890), A0L9.getIntValue(113126854), A0L9.getIntValue(-1221029593));
                        }
                        builder7.m11011add((Object) new BulletListItem(imageParameters2, imageParameters, r07.A0r(110371416), r07.A0r(-2060497896)));
                    }
                    of2 = builder7.build();
                }
                11T.A0A(of2);
                this.bulletList = of2;
                this.clientSideDryRun = A0u.getBooleanValue(1949701891);
                return;
            }
        }
        throw AnonymousClass001.A0Q("Cannot create QuickPromotionDefinition from FbQuickPromotionEdge if FbQuickPromotionEdge#getNode is null or FbQuickPromotionEdge#getCreatives is empty");
    }

    public QuickPromotionDefinition(Parcel parcel) {
        ImmutableMap copyOf;
        ImmutableMap copyOf2;
        this.A02 = 1BK.A0b();
        RegularImmutableSet regularImmutableSet = RegularImmutableSet.A05;
        11T.A0A(regularImmutableSet);
        this.A01 = regularImmutableSet;
        String readString = parcel.readString();
        if (readString == null) {
            throw 1BK.A0h();
        }
        this.promotionId = readString;
        ArrayList readArrayList = parcel.readArrayList(InterstitialTrigger.class.getClassLoader());
        11T.A0I(readArrayList, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.interstitial.triggers.InterstitialTrigger>");
        this.triggers = 1BL.A0a(readArrayList);
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readTypedList(A0s, Creative.CREATOR);
        this.testCreatives = 1BL.A0a(A0s);
        ArrayList A0s2 = AnonymousClass001.A0s();
        parcel.readTypedList(A0s2, Animation.CREATOR);
        this.animations = 1BL.A0a(A0s2);
        ArrayList A0s3 = AnonymousClass001.A0s();
        parcel.readTypedList(A0s3, ContextualFilter.CREATOR);
        this.filters = 1BL.A0a(A0s3);
        this.booleanFilter = (BooleanFilter) 1BL.A0C(parcel, BooleanFilter.class);
        this.title = parcel.readString();
        this.content = parcel.readString();
        this.imageParams = (ImageParameters) 1BL.A0C(parcel, ImageParameters.class);
        this.animatedImageParams = (ImageParameters) 1BL.A0C(parcel, ImageParameters.class);
        this.primaryAction = (Action) 1BL.A0C(parcel, Action.class);
        this.secondaryAction = (Action) 1BL.A0C(parcel, Action.class);
        this.dismissAction = (Action) 1BL.A0C(parcel, Action.class);
        this.socialContext = (SocialContext) 1BL.A0C(parcel, SocialContext.class);
        this.footer = parcel.readString();
        this.template = TemplateType.A00.fromString(parcel.readString());
        HashMap readHashMap = parcel.readHashMap(null);
        if (readHashMap == null) {
            copyOf = RegularImmutableMap.A03;
            11T.A0A(copyOf);
        } else {
            copyOf = ImmutableMap.copyOf((Map) readHashMap);
            11T.A0A(copyOf);
        }
        this.templateParameters = copyOf;
        this.priority = parcel.readLong();
        this.maxImpressions = parcel.readInt();
        this.viewerImpressions = parcel.readInt();
        ArrayList readArrayList2 = parcel.readArrayList(Attribute.class.getClassLoader());
        11T.A0I(readArrayList2, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.quickpromotion.model.QuickPromotionDefinition.Attribute>");
        ImmutableSet A01 = C1n3.A01(readArrayList2);
        11T.A0A(A01);
        this.A01 = A01;
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.clientTtlSeconds = parcel.readLong();
        HashMap readHashMap2 = parcel.readHashMap(null);
        if (readHashMap2 == null) {
            copyOf2 = RegularImmutableMap.A03;
            11T.A0A(copyOf2);
        } else {
            copyOf2 = ImmutableMap.copyOf((Map) readHashMap2);
            11T.A0A(copyOf2);
        }
        this.instanceLogData = copyOf2;
        this.A03 = parcel.readString();
        boolean z = false;
        this.isExposureHoldout = AnonymousClass001.A1Q(parcel.readByte(), 1);
        this.logEligibilityWaterfall = AnonymousClass001.A1Q(parcel.readByte(), 1);
        this.brandingImageParams = (ImageParameters) 1BL.A0C(parcel, ImageParameters.class);
        this.customRenderType = CustomRenderType.A00.fromString(parcel.readString());
        HashMap readHashMap3 = parcel.readHashMap(null);
        ImmutableMap copyOf3 = readHashMap3 == null ? RegularImmutableMap.A03 : ImmutableMap.copyOf((Map) readHashMap3);
        11T.A0A(copyOf3);
        this.customRenderParams = copyOf3;
        this.A04 = AnonymousClass001.A1Q(parcel.readByte(), 1);
        this.A00 = FJ8.A01(parcel);
        ArrayList A0s4 = AnonymousClass001.A0s();
        parcel.readTypedList(A0s4, BulletListItem.CREATOR);
        this.bulletList = ImmutableList.copyOf((Collection) A0s4);
        this.clientSideDryRun = parcel.readByte() == 1 ? true : z;
    }

    public final C2209Dh1 A00() {
        2JX A0u;
        ImmutableList A0c;
        2JY r0;
        2JY A0L;
        2xC r02 = this.A00;
        if (r02 == null || (A0u = r02.A0u()) == null || (A0c = A0u.A0c(598509220, 2JX.class, -206750890)) == null || (r0 = (2JY) 0QD.A0E(A0c)) == null || (A0L = r0.A0L(1580117264, 2JX.class, 1663420787)) == null) {
            return null;
        }
        return (C2209Dh1) A0L.A0K(-2040325063, C2209Dh1.class, 523235254);
    }

    public final 2JX A01() {
        2JX A0u;
        2xC r0 = this.A00;
        if (r0 == null || (A0u = r0.A0u()) == null) {
            return null;
        }
        return A0u.A0L(25730583, 2JX.class, 1566206988);
    }

    public final Creative A02() {
        Object obj = A03().get(0);
        11T.A0A(obj);
        return (Creative) obj;
    }

    public final ImmutableList A03() {
        if (!this.testCreatives.isEmpty()) {
            return this.testCreatives;
        }
        if (this.A02.isEmpty()) {
            String str = this.title;
            String str2 = this.content;
            ImageParameters imageParameters = this.imageParams;
            ImageParameters imageParameters2 = this.animatedImageParams;
            ImmutableList of = ImmutableList.of((Object) new Creative(this.primaryAction, this.secondaryAction, this.dismissAction, imageParameters, imageParameters2, this.brandingImageParams, this.socialContext, this.template, this.templateParameters, str, str2, this.footer));
            11T.A0A(of);
            this.A02 = of;
        }
        return this.A02;
    }

    public final boolean A04() {
        2JX A0u;
        2JY A0L;
        2xC r0 = this.A00;
        return 11T.A0O((r0 == null || (A0u = r0.A0u()) == null || (A0L = A0u.A0L(277050589, 2JX.class, 69930617)) == null) ? null : A0L.A0r(1021171530), "true");
    }

    public final boolean A05() {
        2JX A0u;
        Dky dky;
        2xC r0 = this.A00;
        if (r0 == null || (A0u = r0.A0u()) == null || (dky = (Dky) A0u.A0L(-801074910, Dky.class, 369377121)) == null) {
            return false;
        }
        ImmutableList Ayl = dky.Ayl();
        11T.A0A(Ayl);
        return 1BK.A1Y(Ayl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r0.A0L(-577008838, X.2JX.class, -988564847) == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A06() {
        /*
            r301 = this;
            r0 = r301
            X.2xC r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4f
            r0 = r302
            X.2JX r0 = r0.A0u()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4f
            r0 = 598509220(0x23ac86a4, float:1.87053E-17)
            r304 = r0
            java.lang.Class<X.2JX> r0 = X.2JX.class
            r305 = r0
            r0 = -206750890(0xfffffffff3ad3b56, float:-2.7449671E31)
            r306 = r0
            r0 = r303
            r1 = r304
            r2 = r305
            r3 = r306
            com.google.common.collect.ImmutableList r0 = r0.A0c(r1, r2, r3)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4f
            r0 = r302
            java.lang.Object r0 = X.0QD.A0E(r0)
            X.2JY r0 = (X.2JY) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4f
            r0 = -577008838(0xffffffffdd9b8b3a, float:-1.4010145E18)
            r304 = r0
            r0 = r303
            r1 = r304
            r2 = r305
            r3 = -988564847(0xffffffffc513b291, float:-2363.1604)
            com.facebook.graphservice.tree.TreeJNI r0 = r0.A0L(r1, r2, r3)
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            if (r0 != 0) goto L54
        L4f:
            r0 = 0
            r306 = r0
            r0 = 0
            r302 = r0
        L54:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.model.QuickPromotionDefinition.A06():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ImmutableList getAttributesList() {
        ImmutableList asList = this.A01.asList();
        11T.A0A(asList);
        return asList;
    }

    public final void readAttributes(List list) {
        ImmutableSet A01 = C1n3.A01(list);
        11T.A0A(A01);
        this.A01 = A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.promotionId);
        parcel.writeList(this.triggers);
        parcel.writeTypedList(this.testCreatives);
        parcel.writeTypedList(this.animations);
        parcel.writeTypedList(this.filters);
        parcel.writeParcelable(this.booleanFilter, i);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeParcelable(this.imageParams, i);
        parcel.writeParcelable(this.animatedImageParams, i);
        parcel.writeParcelable(this.primaryAction, i);
        parcel.writeParcelable(this.secondaryAction, i);
        parcel.writeParcelable(this.dismissAction, i);
        parcel.writeParcelable(this.socialContext, i);
        parcel.writeString(this.footer);
        1BL.A12(parcel, this.template);
        parcel.writeMap(this.templateParameters);
        parcel.writeLong(this.priority);
        parcel.writeInt(this.maxImpressions);
        parcel.writeInt(this.viewerImpressions);
        parcel.writeList(this.A01.asList());
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeLong(this.clientTtlSeconds);
        parcel.writeMap(this.instanceLogData);
        parcel.writeString(this.A03);
        parcel.writeByte(this.isExposureHoldout ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.logEligibilityWaterfall ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.brandingImageParams, i);
        1BL.A12(parcel, this.customRenderType);
        parcel.writeMap(this.customRenderParams);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        FJ8.A0A(parcel, this.A00);
        parcel.writeTypedList(this.bulletList);
        parcel.writeByte(this.clientSideDryRun ? (byte) 1 : (byte) 0);
    }
}
