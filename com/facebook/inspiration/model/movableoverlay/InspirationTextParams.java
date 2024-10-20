package com.facebook.inspiration.model.movableoverlay;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbM;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKG;
import X.DKH;
import X.EnumC3494Mfp;
import X.F7t;
import X.FKc;
import X.MRl;
import X.N3W;
import X.NAh;
import X.Qzo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.model.GraphQLTextWithEntities;
import com.facebook.inspiration.model.fonts.InspirationFont;
import com.facebook.inspiration.model.movableoverlay.timedelements.InspirationTimedElementParams;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationTextParams.class */
public final class InspirationTextParams implements NAh, Parcelable {
    public static volatile EnumC3494Mfp A0o;
    public static volatile InspirationFont A0p;
    public static volatile InspirationGraphQLTextWithEntities A0q;
    public static volatile InspirationTextStyle A0r;
    public static volatile SnapbackStrategy A0s;
    public static volatile PersistableRect A0t;
    public static volatile PersistableRect A0u;
    public static final Parcelable.Creator CREATOR = new FKc(53);
    public final double A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final long A0H;
    public final EnumC3494Mfp A0I;
    public final InspirationFont A0J;
    public final InspirationAIGeneratedTextInputParams A0K;
    public final InspirationGraphQLTextWithEntities A0L;
    public final InspirationTextStyle A0M;
    public final SnapbackStrategy A0N;
    public final InspirationTimedElementParams A0O;
    public final PersistableRect A0P;
    public final PersistableRect A0Q;
    public final ImmutableList A0R;
    public final ImmutableList A0S;
    public final Float A0T;
    public final Float A0U;
    public final Float A0V;
    public final Float A0W;
    public final Integer A0X;
    public final Integer A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final Set A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;

    /* loaded from: InspirationTextParams$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str;
            N3W n3w = new N3W();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2117277325:
                                if (A1C.equals("text_align")) {
                                    n3w.A07(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2106465089:
                                if (A1C.equals("selected_color")) {
                                    n3w.A0C = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2100961746:
                                if (A1C.equals("selected_index")) {
                                    n3w.A0D = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2100400097:
                                if (A1C.equals("text_style")) {
                                    n3w.A04((InspirationTextStyle) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationTextStyle.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2077449494:
                                if (A1C.equals("effect_from_i_g")) {
                                    n3w.A0Z = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2067408082:
                                if (A1C.equals("time_created_ns")) {
                                    n3w.A0H = abstractC01033pi.A1B();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1817616898:
                                if (A1C.equals("center_x_from_template")) {
                                    n3w.A0V = (Float) AbstractC11224vw.A02(abstractC01033pi, c27t, Float.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1817104942:
                                if (A1C.equals("left_percentage")) {
                                    n3w.A02 = abstractC01033pi.A13();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1467933091:
                                if (A1C.equals("number_of_creative_elements_present_before_smart_placement")) {
                                    n3w.A0Y = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1416323733:
                                if (A1C.equals("text_color_used")) {
                                    n3w.A0F = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1261118192:
                                if (A1C.equals("should_allow_moving")) {
                                    n3w.A0j = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1246710908:
                                if (A1C.equals("shadow_color")) {
                                    n3w.A0E = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1221029593:
                                if (A1C.equals(Property.ICON_TEXT_FIT_HEIGHT)) {
                                    n3w.A0B = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1166667645:
                                if (A1C.equals("should_allow_removing")) {
                                    n3w.A0k = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1153157338:
                                if (A1C.equals("ai_generated_text_input_params")) {
                                    n3w.A0K = (InspirationAIGeneratedTextInputParams) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationAIGeneratedTextInputParams.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1037596717:
                                if (A1C.equals("text_size")) {
                                    n3w.A08 = abstractC01033pi.A13();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1020290114:
                                if (A1C.equals("shadow_d_x")) {
                                    n3w.A04 = abstractC01033pi.A13();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1020290113:
                                if (A1C.equals("shadow_d_y")) {
                                    n3w.A05 = abstractC01033pi.A13();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -989755924:
                                if (A1C.equals("font_from_i_g")) {
                                    n3w.A0a = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -865185719:
                                if (A1C.equals("center_relative_y_from_smart_placement")) {
                                    n3w.A0U = (Float) AbstractC11224vw.A02(abstractC01033pi, c27t, Float.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -694150208:
                                if (A1C.equals("should_allow_rotation")) {
                                    n3w.A0l = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -538310583:
                                if (A1C.equals("unique_id")) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    n3w.A0e = A03;
                                    C1pq.A08("uniqueId", A03);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -469297384:
                                if (A1C.equals("font_color_override")) {
                                    n3w.A0X = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -409557505:
                                if (A1C.equals("initial_rect")) {
                                    PersistableRect persistableRect = (PersistableRect) AbstractC11224vw.A02(abstractC01033pi, c27t, PersistableRect.class);
                                    n3w.A0P = persistableRect;
                                    str = "initialRect";
                                    C1pq.A08(str, persistableRect);
                                    N3W.A00(n3w, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -361805646:
                                if (A1C.equals("height_percentage")) {
                                    n3w.A01 = abstractC01033pi.A13();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -310065089:
                                if (A1C.equals("center_y_from_template")) {
                                    n3w.A0W = (Float) AbstractC11224vw.A02(abstractC01033pi, c27t, Float.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -289875203:
                                if (A1C.equals("inspiration_text_with_entities")) {
                                    n3w.A03((InspirationGraphQLTextWithEntities) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationGraphQLTextWithEntities.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -40300674:
                                if (A1C.equals("rotation")) {
                                    n3w.A03 = abstractC01033pi.A13();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 3148879:
                                if (A1C.equals("font")) {
                                    n3w.A02((InspirationFont) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationFont.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 3598471:
                                if (A1C.equals("uris")) {
                                    n3w.A06(MRl.A0G(abstractC01033pi, c27t));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 58881585:
                                if (A1C.equals("timed_element_params")) {
                                    n3w.A0O = (InspirationTimedElementParams) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationTimedElementParams.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 113126854:
                                if (A1C.equals(Property.ICON_TEXT_FIT_WIDTH)) {
                                    n3w.A0G = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 199385941:
                                if (A1C.equals("is_text_from_initial_text_for_text_tool")) {
                                    n3w.A0i = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 227237637:
                                if (A1C.equals("should_allow_scaling")) {
                                    n3w.A0m = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 422931601:
                                if (A1C.equals("shadow_radius")) {
                                    n3w.A06 = abstractC01033pi.A13();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 658202158:
                                if (A1C.equals("selection_source")) {
                                    n3w.A01((EnumC3494Mfp) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3494Mfp.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 720621508:
                                if (A1C.equals("top_percentage")) {
                                    n3w.A09 = abstractC01033pi.A13();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 770040499:
                                if (A1C.equals("width_percentage")) {
                                    n3w.A0A = abstractC01033pi.A13();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1096128703:
                                if (A1C.equals("size_multiplier")) {
                                    n3w.A07 = abstractC01033pi.A13();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1172870570:
                                if (A1C.equals("center_relative_x_from_smart_placement")) {
                                    n3w.A0T = (Float) AbstractC11224vw.A02(abstractC01033pi, c27t, Float.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1397085115:
                                if (A1C.equals("previous_text_align")) {
                                    String A032 = AbstractC11224vw.A03(abstractC01033pi);
                                    n3w.A0b = A032;
                                    C1pq.A08("previousTextAlign", A032);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1571987955:
                                if (A1C.equals("is_auto_added_from_tool")) {
                                    n3w.A0g = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1572334657:
                                if (A1C.equals("snapback_strategy")) {
                                    SnapbackStrategy snapbackStrategy = (SnapbackStrategy) AbstractC11224vw.A02(abstractC01033pi, c27t, SnapbackStrategy.class);
                                    n3w.A0N = snapbackStrategy;
                                    str = "snapbackStrategy";
                                    C1pq.A08(str, snapbackStrategy);
                                    N3W.A00(n3w, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1624329085:
                                if (A1C.equals("should_show_floating_edit_buttons_on_text")) {
                                    n3w.A0n = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1661853540:
                                if (A1C.equals("session_id")) {
                                    String A033 = AbstractC11224vw.A03(abstractC01033pi);
                                    n3w.A0c = A033;
                                    C1pq.A08("sessionId", A033);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1797686785:
                                if (A1C.equals("is_from_ay_template")) {
                                    n3w.A0h = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1939796319:
                                if (A1C.equals("media_rect")) {
                                    n3w.A05((PersistableRect) AbstractC11224vw.A02(abstractC01033pi, c27t, PersistableRect.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1993065956:
                                if (A1C.equals("scale_factor")) {
                                    n3w.A00 = abstractC01033pi.A11();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2052329115:
                                if (A1C.equals("text_mentions")) {
                                    ImmutableList A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationTextMention.class);
                                    n3w.A0R = A00;
                                    C1pq.A08("textMentions", A00);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            default:
                                abstractC01033pi.A20();
                                break;
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationTextParams.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationTextParams(n3w);
        }
    }

    /* loaded from: InspirationTextParams$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationTextParams inspirationTextParams = (InspirationTextParams) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, inspirationTextParams.A0K, "ai_generated_text_input_params");
            AbstractC11224vw.A0A(r302, inspirationTextParams.A0T, "center_relative_x_from_smart_placement");
            AbstractC11224vw.A0A(r302, inspirationTextParams.A0U, "center_relative_y_from_smart_placement");
            AbstractC11224vw.A0A(r302, inspirationTextParams.A0V, "center_x_from_template");
            AbstractC11224vw.A0A(r302, inspirationTextParams.A0W, "center_y_from_template");
            AbstractC11224vw.A0D(r302, "effect_from_i_g", inspirationTextParams.A0Z);
            AbstractC11224vw.A05(r302, c26c, inspirationTextParams.A01(), "font");
            AbstractC11224vw.A0B(r302, inspirationTextParams.A0X, "font_color_override");
            AbstractC11224vw.A0D(r302, "font_from_i_g", inspirationTextParams.A0a);
            int i = inspirationTextParams.A0B;
            r302.A0o(Property.ICON_TEXT_FIT_HEIGHT);
            r302.A0f(i);
            float f = inspirationTextParams.A01;
            r302.A0o("height_percentage");
            r302.A0e(f);
            AbstractC11224vw.A05(r302, c26c, inspirationTextParams.A04(), "initial_rect");
            AbstractC11224vw.A05(r302, c26c, inspirationTextParams.A02(), "inspiration_text_with_entities");
            boolean z = inspirationTextParams.A0g;
            r302.A0o("is_auto_added_from_tool");
            r302.A0v(z);
            boolean z2 = inspirationTextParams.A0h;
            r302.A0o("is_from_ay_template");
            r302.A0v(z2);
            boolean z3 = inspirationTextParams.A0i;
            r302.A0o("is_text_from_initial_text_for_text_tool");
            r302.A0v(z3);
            float f2 = inspirationTextParams.A02;
            r302.A0o("left_percentage");
            r302.A0e(f2);
            AbstractC11224vw.A05(r302, c26c, inspirationTextParams.AwK(), "media_rect");
            AbstractC11224vw.A0B(r302, inspirationTextParams.A0Y, "number_of_creative_elements_present_before_smart_placement");
            AbstractC11224vw.A0D(r302, "previous_text_align", inspirationTextParams.A0b);
            float f3 = inspirationTextParams.A03;
            r302.A0o("rotation");
            r302.A0e(f3);
            double d = inspirationTextParams.A00;
            r302.A0o("scale_factor");
            r302.A0d(d);
            int i2 = inspirationTextParams.A0C;
            r302.A0o("selected_color");
            r302.A0f(i2);
            int i3 = inspirationTextParams.A0D;
            r302.A0o("selected_index");
            r302.A0f(i3);
            AbstractC11224vw.A05(r302, c26c, inspirationTextParams.A00(), "selection_source");
            AbstractC11224vw.A0D(r302, "session_id", inspirationTextParams.A0c);
            int i4 = inspirationTextParams.A0E;
            r302.A0o("shadow_color");
            r302.A0f(i4);
            float f4 = inspirationTextParams.A04;
            r302.A0o("shadow_d_x");
            r302.A0e(f4);
            float f5 = inspirationTextParams.A05;
            r302.A0o("shadow_d_y");
            r302.A0e(f5);
            float f6 = inspirationTextParams.A06;
            r302.A0o("shadow_radius");
            r302.A0e(f6);
            boolean z4 = inspirationTextParams.A0j;
            r302.A0o("should_allow_moving");
            r302.A0v(z4);
            boolean z5 = inspirationTextParams.A0k;
            r302.A0o("should_allow_removing");
            r302.A0v(z5);
            boolean z6 = inspirationTextParams.A0l;
            r302.A0o("should_allow_rotation");
            r302.A0v(z6);
            boolean z7 = inspirationTextParams.A0m;
            r302.A0o("should_allow_scaling");
            r302.A0v(z7);
            boolean z8 = inspirationTextParams.A0n;
            r302.A0o("should_show_floating_edit_buttons_on_text");
            r302.A0v(z8);
            float f7 = inspirationTextParams.A07;
            r302.A0o("size_multiplier");
            r302.A0e(f7);
            AbstractC11224vw.A05(r302, c26c, inspirationTextParams.BBL(), "snapback_strategy");
            AbstractC11224vw.A0D(r302, "text_align", inspirationTextParams.A0d);
            int i5 = inspirationTextParams.A0F;
            r302.A0o("text_color_used");
            r302.A0f(i5);
            AbstractC11224vw.A06(r302, c26c, "text_mentions", inspirationTextParams.A0R);
            float f8 = inspirationTextParams.A08;
            r302.A0o("text_size");
            r302.A0e(f8);
            AbstractC11224vw.A05(r302, c26c, inspirationTextParams.A03(), "text_style");
            long j = inspirationTextParams.A0H;
            r302.A0o("time_created_ns");
            r302.A0g(j);
            AbstractC11224vw.A05(r302, c26c, inspirationTextParams.A0O, "timed_element_params");
            float f9 = inspirationTextParams.A09;
            r302.A0o("top_percentage");
            r302.A0e(f9);
            AbstractC11224vw.A0D(r302, "unique_id", inspirationTextParams.A0e);
            AbstractC11224vw.A06(r302, c26c, "uris", inspirationTextParams.A0S);
            int i6 = inspirationTextParams.A0G;
            r302.A0o(Property.ICON_TEXT_FIT_WIDTH);
            r302.A0f(i6);
            float f10 = inspirationTextParams.A0A;
            r302.A0o("width_percentage");
            r302.A0e(f10);
            r302.A0Y();
        }
    }

    public InspirationTextParams(N3W n3w) {
        this.A0K = n3w.A0K;
        this.A0T = n3w.A0T;
        this.A0U = n3w.A0U;
        this.A0V = n3w.A0V;
        this.A0W = n3w.A0W;
        this.A0Z = n3w.A0Z;
        this.A0J = n3w.A0J;
        this.A0X = n3w.A0X;
        this.A0a = n3w.A0a;
        this.A0B = n3w.A0B;
        this.A01 = n3w.A01;
        this.A0P = n3w.A0P;
        this.A0L = n3w.A0L;
        this.A0g = n3w.A0g;
        this.A0h = n3w.A0h;
        this.A0i = n3w.A0i;
        this.A02 = n3w.A02;
        this.A0Q = n3w.A0Q;
        this.A0Y = n3w.A0Y;
        String str = n3w.A0b;
        C1pq.A08("previousTextAlign", str);
        this.A0b = str;
        this.A03 = n3w.A03;
        this.A00 = n3w.A00;
        this.A0C = n3w.A0C;
        this.A0D = n3w.A0D;
        this.A0I = n3w.A0I;
        String str2 = n3w.A0c;
        C1pq.A08("sessionId", str2);
        this.A0c = str2;
        this.A0E = n3w.A0E;
        this.A04 = n3w.A04;
        this.A05 = n3w.A05;
        this.A06 = n3w.A06;
        this.A0j = n3w.A0j;
        this.A0k = n3w.A0k;
        this.A0l = n3w.A0l;
        this.A0m = n3w.A0m;
        this.A0n = n3w.A0n;
        this.A07 = n3w.A07;
        this.A0N = n3w.A0N;
        String str3 = n3w.A0d;
        C1pq.A08("textAlign", str3);
        this.A0d = str3;
        this.A0F = n3w.A0F;
        ImmutableList immutableList = n3w.A0R;
        C1pq.A08("textMentions", immutableList);
        this.A0R = immutableList;
        this.A08 = n3w.A08;
        this.A0M = n3w.A0M;
        this.A0H = n3w.A0H;
        this.A0O = n3w.A0O;
        this.A09 = n3w.A09;
        String str4 = n3w.A0e;
        C1pq.A08("uniqueId", str4);
        this.A0e = str4;
        ImmutableList immutableList2 = n3w.A0S;
        C1pq.A08("uris", immutableList2);
        this.A0S = immutableList2;
        this.A0G = n3w.A0G;
        this.A0A = n3w.A0A;
        this.A0f = Collections.unmodifiableSet(n3w.A0f);
    }

    public InspirationTextParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        InspirationTimedElementParams inspirationTimedElementParams = null;
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = (InspirationAIGeneratedTextInputParams) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = MRl.A0I(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = MRl.A0I(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            this.A0V = MRl.A0I(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0W = null;
        } else {
            this.A0W = MRl.A0I(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0Z = null;
        } else {
            this.A0Z = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = (InspirationFont) InspirationFont.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0a = null;
        } else {
            this.A0a = parcel.readString();
        }
        this.A0B = parcel.readInt();
        this.A01 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = DKG.A0o(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = (InspirationGraphQLTextWithEntities) InspirationGraphQLTextWithEntities.CREATOR.createFromParcel(parcel);
        }
        int i = 0;
        this.A0g = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0h = 1BM.A07(parcel);
        this.A0i = 1BM.A07(parcel);
        this.A02 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = DKG.A0o(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = AbI.A0z(parcel);
        }
        this.A0b = parcel.readString();
        this.A03 = parcel.readFloat();
        this.A00 = parcel.readDouble();
        this.A0C = parcel.readInt();
        this.A0D = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = EnumC3494Mfp.values()[parcel.readInt()];
        }
        this.A0c = parcel.readString();
        this.A0E = parcel.readInt();
        this.A04 = parcel.readFloat();
        this.A05 = parcel.readFloat();
        this.A06 = parcel.readFloat();
        this.A0j = 1BM.A07(parcel);
        this.A0k = 1BM.A07(parcel);
        this.A0l = 1BM.A07(parcel);
        this.A0m = 1BM.A07(parcel);
        this.A0n = AbJ.A1V(parcel);
        this.A07 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = (SnapbackStrategy) parcel.readParcelable(A0e);
        }
        this.A0d = parcel.readString();
        this.A0F = parcel.readInt();
        int readInt = parcel.readInt();
        InspirationTextMention[] inspirationTextMentionArr = new InspirationTextMention[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, inspirationTextMentionArr, i2);
        }
        this.A0R = ImmutableList.copyOf(inspirationTextMentionArr);
        this.A08 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = (InspirationTextStyle) parcel.readParcelable(A0e);
        }
        this.A0H = parcel.readLong();
        this.A0O = parcel.readInt() != 0 ? (InspirationTimedElementParams) InspirationTimedElementParams.CREATOR.createFromParcel(parcel) : inspirationTimedElementParams;
        this.A09 = parcel.readFloat();
        this.A0e = parcel.readString();
        int readInt2 = parcel.readInt();
        String[] strArr = new String[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbH.A00(parcel, strArr, i3);
        }
        this.A0S = ImmutableList.copyOf(strArr);
        this.A0G = parcel.readInt();
        this.A0A = parcel.readFloat();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0f = Collections.unmodifiableSet(A0v);
    }

    public EnumC3494Mfp A00() {
        if (this.A0f.contains("selectionSource")) {
            return this.A0I;
        }
        if (A0o == null) {
            synchronized (this) {
                if (A0o == null) {
                    A0o = EnumC3494Mfp.UNKNOWN;
                }
            }
        }
        return A0o;
    }

    public InspirationFont A01() {
        if (this.A0f.contains("font")) {
            return this.A0J;
        }
        if (A0p == null) {
            synchronized (this) {
                if (A0p == null) {
                    A0p = F7t.A03;
                }
            }
        }
        return A0p;
    }

    public InspirationGraphQLTextWithEntities A02() {
        if (this.A0f.contains("inspirationTextWithEntities")) {
            return this.A0L;
        }
        if (A0q == null) {
            synchronized (this) {
                if (A0q == null) {
                    GraphQLTextWithEntities A00 = Qzo.A00("");
                    11T.A0A(A00);
                    A0q = new InspirationGraphQLTextWithEntities(A00);
                }
            }
        }
        return A0q;
    }

    public InspirationTextStyle A03() {
        if (this.A0f.contains("textStyle")) {
            return this.A0M;
        }
        if (A0r == null) {
            synchronized (this) {
                if (A0r == null) {
                    A0r = new InspirationTextStyle(null, "default", 0, 0, 0, false);
                }
            }
        }
        return A0r;
    }

    public PersistableRect A04() {
        if (this.A0f.contains("initialRect")) {
            return this.A0P;
        }
        if (A0t == null) {
            synchronized (this) {
                if (A0t == null) {
                    A0t = new PersistableRect(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return A0t;
    }

    @Override // X.NAh
    public float Aoy() {
        return this.A01;
    }

    @Override // X.NAh
    public float Atd() {
        return this.A02;
    }

    @Override // X.NAh
    public PersistableRect AwK() {
        if (this.A0f.contains("mediaRect")) {
            return this.A0Q;
        }
        if (A0u == null) {
            synchronized (this) {
                if (A0u == null) {
                    A0u = new PersistableRect(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return A0u;
    }

    @Override // X.NAh
    public float B8H() {
        return this.A03;
    }

    @Override // X.NAh
    public double B8m() {
        return this.A00;
    }

    @Override // X.NAh
    public int B9j() {
        return this.A0D;
    }

    @Override // X.NAh
    public String BAE() {
        return this.A0c;
    }

    @Override // X.NAh
    public boolean BAb() {
        return this.A0j;
    }

    @Override // X.NAh
    public boolean BAc() {
        return this.A0k;
    }

    @Override // X.NAh
    public boolean BAd() {
        return this.A0l;
    }

    @Override // X.NAh
    public boolean BAe() {
        return this.A0m;
    }

    @Override // X.NAh
    public SnapbackStrategy BBL() {
        if (this.A0f.contains("snapbackStrategy")) {
            return this.A0N;
        }
        if (A0s == null) {
            synchronized (this) {
                if (A0s == null) {
                    A0s = new SnapbackStrategy(null, null, null, null, null, AnonymousClass001.A0v());
                }
            }
        }
        return A0s;
    }

    @Override // X.NAh
    public InspirationTimedElementParams BFr() {
        return this.A0O;
    }

    @Override // X.NAh
    public float BGR() {
        return this.A09;
    }

    @Override // X.NAh
    public String BHy() {
        return this.A0e;
    }

    @Override // X.NAh
    public /* bridge */ /* synthetic */ ImmutableList BIO() {
        return this.A0S;
    }

    @Override // X.NAh
    public float BKm() {
        return this.A0A;
    }

    @Override // X.NAh
    public boolean BQo() {
        return this.A0g;
    }

    @Override // X.NAh
    public boolean BSy() {
        return this.A0h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationTextParams)) {
                return false;
            }
            InspirationTextParams inspirationTextParams = (InspirationTextParams) obj;
            if (!11T.A0O(this.A0K, inspirationTextParams.A0K) || !11T.A0O(this.A0T, inspirationTextParams.A0T) || !11T.A0O(this.A0U, inspirationTextParams.A0U) || !11T.A0O(this.A0V, inspirationTextParams.A0V) || !11T.A0O(this.A0W, inspirationTextParams.A0W) || !11T.A0O(this.A0Z, inspirationTextParams.A0Z) || !11T.A0O(A01(), inspirationTextParams.A01()) || !11T.A0O(this.A0X, inspirationTextParams.A0X) || !11T.A0O(this.A0a, inspirationTextParams.A0a) || this.A0B != inspirationTextParams.A0B || this.A01 != inspirationTextParams.A01 || !11T.A0O(A04(), inspirationTextParams.A04()) || !11T.A0O(A02(), inspirationTextParams.A02()) || this.A0g != inspirationTextParams.A0g || this.A0h != inspirationTextParams.A0h || this.A0i != inspirationTextParams.A0i || this.A02 != inspirationTextParams.A02 || !11T.A0O(AwK(), inspirationTextParams.AwK()) || !11T.A0O(this.A0Y, inspirationTextParams.A0Y) || !11T.A0O(this.A0b, inspirationTextParams.A0b) || this.A03 != inspirationTextParams.A03 || this.A00 != inspirationTextParams.A00 || this.A0C != inspirationTextParams.A0C || this.A0D != inspirationTextParams.A0D || A00() != inspirationTextParams.A00() || !11T.A0O(this.A0c, inspirationTextParams.A0c) || this.A0E != inspirationTextParams.A0E || this.A04 != inspirationTextParams.A04 || this.A05 != inspirationTextParams.A05 || this.A06 != inspirationTextParams.A06 || this.A0j != inspirationTextParams.A0j || this.A0k != inspirationTextParams.A0k || this.A0l != inspirationTextParams.A0l || this.A0m != inspirationTextParams.A0m || this.A0n != inspirationTextParams.A0n || this.A07 != inspirationTextParams.A07 || !11T.A0O(BBL(), inspirationTextParams.BBL()) || !11T.A0O(this.A0d, inspirationTextParams.A0d) || this.A0F != inspirationTextParams.A0F || !11T.A0O(this.A0R, inspirationTextParams.A0R) || this.A08 != inspirationTextParams.A08 || !11T.A0O(A03(), inspirationTextParams.A03()) || this.A0H != inspirationTextParams.A0H || !11T.A0O(this.A0O, inspirationTextParams.A0O) || this.A09 != inspirationTextParams.A09 || !11T.A0O(this.A0e, inspirationTextParams.A0e) || !11T.A0O(this.A0S, inspirationTextParams.A0S) || this.A0G != inspirationTextParams.A0G || this.A0A != inspirationTextParams.A0A) {
                return false;
            }
        }
        return true;
    }

    @Override // X.NAh
    public int getHeight() {
        return this.A0B;
    }

    @Override // X.NAh
    public int getWidth() {
        return this.A0G;
    }

    public int hashCode() {
        int A00 = (((C1pq.A00(this.A00, AbM.A00(C1pq.A04(this.A0b, C1pq.A04(this.A0Y, C1pq.A04(AwK(), AbM.A00(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(A02(), C1pq.A04(A04(), AbM.A00((C1pq.A04(this.A0a, C1pq.A04(this.A0X, C1pq.A04(A01(), C1pq.A04(this.A0Z, C1pq.A04(this.A0W, C1pq.A04(this.A0V, C1pq.A04(this.A0U, C1pq.A04(this.A0T, C1pq.A03(this.A0K))))))))) * 31) + this.A0B, this.A01))), this.A0g), this.A0h), this.A0i), this.A02)))), this.A03)) * 31) + this.A0C) * 31) + this.A0D;
        return AbM.A00((C1pq.A04(this.A0S, C1pq.A04(this.A0e, AbM.A00(C1pq.A04(this.A0O, C1pq.A01(C1pq.A04(A03(), AbM.A00(C1pq.A04(this.A0R, (C1pq.A04(this.A0d, C1pq.A04(BBL(), AbM.A00(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(AbM.A00(AbM.A00(AbM.A00((C1pq.A04(this.A0c, (A00 * 31) + C3o5.A03(A00())) * 31) + this.A0E, this.A04), this.A05), this.A06), this.A0j), this.A0k), this.A0l), this.A0m), this.A0n), this.A07))) * 31) + this.A0F), this.A08)), this.A0H)), this.A09))) * 31) + this.A0G, this.A0A);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A0K, i);
        DKH.A12(parcel, this.A0T);
        DKH.A12(parcel, this.A0U);
        DKH.A12(parcel, this.A0V);
        DKH.A12(parcel, this.A0W);
        1BL.A13(parcel, this.A0Z);
        InspirationFont inspirationFont = this.A0J;
        if (inspirationFont == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationFont.writeToParcel(parcel, i);
        }
        C3o5.A0f(parcel, this.A0X);
        1BL.A13(parcel, this.A0a);
        parcel.writeInt(this.A0B);
        parcel.writeFloat(this.A01);
        DKH.A11(parcel, this.A0P, i);
        InspirationGraphQLTextWithEntities inspirationGraphQLTextWithEntities = this.A0L;
        if (inspirationGraphQLTextWithEntities == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationGraphQLTextWithEntities.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0g ? 1 : 0);
        parcel.writeInt(this.A0h ? 1 : 0);
        parcel.writeInt(this.A0i ? 1 : 0);
        parcel.writeFloat(this.A02);
        DKH.A11(parcel, this.A0Q, i);
        C3o5.A0f(parcel, this.A0Y);
        parcel.writeString(this.A0b);
        parcel.writeFloat(this.A03);
        parcel.writeDouble(this.A00);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0D);
        C3o5.A0e(parcel, this.A0I);
        parcel.writeString(this.A0c);
        parcel.writeInt(this.A0E);
        parcel.writeFloat(this.A04);
        parcel.writeFloat(this.A05);
        parcel.writeFloat(this.A06);
        parcel.writeInt(this.A0j ? 1 : 0);
        parcel.writeInt(this.A0k ? 1 : 0);
        parcel.writeInt(this.A0l ? 1 : 0);
        parcel.writeInt(this.A0m ? 1 : 0);
        parcel.writeInt(this.A0n ? 1 : 0);
        parcel.writeFloat(this.A07);
        C3o5.A0d(parcel, this.A0N, i);
        parcel.writeString(this.A0d);
        parcel.writeInt(this.A0F);
        1Du A0b = 1BL.A0b(parcel, this.A0R);
        while (A0b.hasNext()) {
            parcel.writeParcelable((InspirationTextMention) A0b.next(), i);
        }
        parcel.writeFloat(this.A08);
        C3o5.A0d(parcel, this.A0M, i);
        parcel.writeLong(this.A0H);
        InspirationTimedElementParams inspirationTimedElementParams = this.A0O;
        if (inspirationTimedElementParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationTimedElementParams.writeToParcel(parcel, i);
        }
        parcel.writeFloat(this.A09);
        parcel.writeString(this.A0e);
        1Du A0b2 = 1BL.A0b(parcel, this.A0S);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        parcel.writeInt(this.A0G);
        parcel.writeFloat(this.A0A);
        Iterator A0S = C3o5.A0S(parcel, this.A0f);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
