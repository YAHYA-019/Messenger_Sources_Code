package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.02A, reason: invalid class name */
/* loaded from: 02A.class */
public final class C02A {
    public static int DEFAULT_BACKGROUND_THREAD_PRIORITY = 5;
    public static final int DEFAULT_CHANGE_SET_THREAD_PRIORITY = 0;
    public static final boolean USE_INCREMENTAL_MOUNT_HELPER = true;
    public static boolean bindOnSameComponentTree = true;
    public static boolean boostPerfLayoutStateFuture = false;
    public static boolean clearEventHandlersAndTriggers = false;
    public static boolean computeRangeOnSyncLayout = false;
    public static boolean disableReleaseComponentTreeInRecyclerBinder = false;
    public static boolean enableComputeLayoutAsyncAfterInsertion = true;
    public static boolean enableFixForDisappearTransitionInRecyclerBinder = false;
    public static boolean enableFixForStickyHeader = false;
    public static boolean enableLoggingForInvalidAspectRatio = false;
    public static boolean enablePrimitiveMeasurementFix = false;
    public static boolean enableThreadTracingStacktrace = false;
    public static boolean forceEnableTransitionsForInstrumentationTests = false;
    public static int hostComponentPoolSize = 30;
    public static boolean initStickyHeaderInLayoutWhenComponentTreeIsNull = false;
    public static boolean isAnimationDisabled = false;
    public static boolean isEndToEndTestRun = false;
    public static boolean isEventHandlerRebindLoggingEnabled = false;
    public static boolean isYogaFlexBasisFixEnabled = true;
    public static boolean isZeroAlphaLoggingEnabled = false;
    public static boolean keepLayoutResults = false;
    public static int overlappingRenderingViewSizeLimit = Integer.MAX_VALUE;
    public static int partialAlphaWarningSizeThresold = Integer.MAX_VALUE;
    public static Qws perfBoosterFactory;
    public static int recyclerBinderStrategy = 0;
    public static boolean reduceMemorySpikeDataDiffSection = false;
    public static boolean reduceMemorySpikeGetUri = false;
    public static boolean reduceMemorySpikeUserSession = false;
    public static boolean runLooperPrepareForLayoutThreadFactory = true;
    public static boolean shouldCompareCommonPropsInIsEquivalentTo;
    public static boolean shouldCompareRootCommonPropsInSingleComponentSection;
    public static boolean shouldOverrideHasTransientState;
    public static boolean useOneShotPreDrawListener;
    public static boolean usePrimitiveImage;
    public static boolean useSafeSpanEndInTextInputSpec;
    public boolean A00;
    public final 1Il A01;
    public final C1J8 A02;
    public final 1JB A03;
    public final 1Ii A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final Function1 A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public static final 02B Companion = new Object();
    public static C02A defaultInstance = new C02A(null, null, null, null, null, null, null, null, null, null, null, null, -1, 31, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.02B, java.lang.Object] */
    static {
        boolean z = false;
        if (System.getProperty("IS_TESTING") != null) {
            z = true;
        }
        isEndToEndTestRun = z;
        isAnimationDisabled = "true".equals(System.getProperty("litho.animation.disabled"));
    }

    public C02A() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, -1, 31, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0131, code lost:
    
        if (r315 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C02A(X.1Il r302, X.C1J8 r303, X.1JB r304, X.1Ii r305, java.lang.Integer r306, java.lang.Integer r307, java.lang.Integer r308, java.lang.String r309, kotlin.jvm.functions.Function1 r310, boolean r311, boolean r312, boolean r313, boolean r314, boolean r315, boolean r316, boolean r317, boolean r318, boolean r319, boolean r320, boolean r321, boolean r322, boolean r323, boolean r324, boolean r325, boolean r326, boolean r327, boolean r328, boolean r329, boolean r330, boolean r331, boolean r332, boolean r333, boolean r334, boolean r335, boolean r336) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02A.<init>(X.1Il, X.1J8, X.1JB, X.1Ii, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, kotlin.jvm.functions.Function1, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public /* synthetic */ C02A(N9S n9s, 1Il r303, C1J8 c1j8, 1JB r305, 1Ii r306, N9d n9d, Integer num, Integer num2, Integer num3, String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26) {
        this(1Ik.A00, null, null, 1If.A00, null, 0S2.A01, 0S2.A00, null, null, true, false, false, false, false, false, true, true, false, false, false, false, false, false, false, true, true, true, false, false, false, true, false, false, false, false);
    }

    public static /* synthetic */ C02A A00(1Il r301, C02A c02a, C1J8 c1j8, 1JB r304, 1Ii r305, Integer num, Integer num2, String str, Function1 function1, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23) {
        boolean z24 = z22;
        boolean z25 = z21;
        Integer num3 = num;
        boolean z26 = z23;
        boolean z27 = z14;
        String str2 = str;
        boolean z28 = z7;
        1Ii r342 = r305;
        1JB r343 = r304;
        boolean z29 = z6;
        boolean z30 = z5;
        C1J8 c1j82 = c1j8;
        boolean z31 = z10;
        boolean z32 = z4;
        boolean z33 = z19;
        boolean z34 = z3;
        boolean z35 = z2;
        boolean z36 = z;
        boolean z37 = z9;
        boolean z38 = z11;
        boolean z39 = z12;
        boolean z40 = z17;
        boolean z41 = z8;
        Integer num4 = num2;
        boolean z42 = z15;
        Function1 function12 = function1;
        boolean z43 = z13;
        boolean z44 = z16;
        boolean z45 = z18;
        boolean z46 = z20;
        Integer num5 = null;
        if ((i & 1) != 0) {
            z36 = c02a.A0C;
        }
        if ((i & 2) != 0) {
            z35 = c02a.A0Q;
        }
        boolean z47 = (i & 4) != 0 ? c02a.A0U : false;
        if ((i & 8) != 0) {
            z34 = c02a.A0V;
        }
        if ((i & 16) != 0) {
            z32 = c02a.A0Z;
        }
        if ((i & 32) != 0) {
            c1j82 = c02a.A02;
        }
        if ((i & 64) != 0) {
            z30 = c02a.A0A;
        }
        if ((i & 128) != 0) {
            z29 = c02a.A0N;
        }
        if ((i & 256) != 0) {
            r342 = c02a.A04;
        }
        if ((i & 512) != 0) {
            z28 = c02a.A0Y;
        }
        if ((i & 1024) != 0) {
            r301 = c02a.A01;
        }
        if ((i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            r343 = c02a.A03;
        }
        if ((i & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) != 0) {
            str2 = c02a.A08;
        }
        if ((i & 8192) != 0) {
            num3 = c02a.A06;
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            z41 = c02a.A00;
        }
        if ((i & 65536) != 0) {
            z37 = c02a.A0K;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            z31 = c02a.A0D;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            z38 = c02a.A0B;
        }
        if ((i & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            z39 = c02a.A0M;
        }
        if ((i & 1048576) != 0) {
            z43 = c02a.A0T;
        }
        if ((i & 2097152) != 0) {
            num4 = c02a.A07;
        }
        if ((i & 4194304) != 0) {
            z27 = c02a.A0F;
        }
        if ((i & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            z42 = c02a.A0H;
        }
        if ((i & 33554432) != 0) {
            function12 = c02a.A09;
        }
        if ((i & 67108864) != 0) {
            z44 = c02a.A0X;
        }
        boolean z48 = (i & 134217728) != 0 ? c02a.A0P : false;
        if ((i & 268435456) != 0) {
            z40 = c02a.A0J;
        }
        if ((i & 536870912) != 0) {
            z45 = c02a.A0G;
        }
        if ((i & 1073741824) != 0) {
            z33 = c02a.A0I;
        }
        if ((i & ((-1) << (-1))) != 0) {
            z46 = c02a.A0S;
        }
        if ((i2 & 1) != 0) {
            num5 = c02a.A05;
        }
        if ((i2 & 2) != 0) {
            z25 = c02a.A0O;
        }
        if ((i2 & 4) != 0) {
            z24 = c02a.A0L;
        }
        if ((i2 & 8) != 0) {
            z26 = c02a.A0E;
        }
        return A01(r301, c1j82, r343, r342, num3, num4, num5, str2, function12, z36, z35, z47, z34, z32, z30, z29, z28, z41, z37, z31, z38, z39, z43, z27, z42, z44, z48, z40, z45, z33, z46, z25, z24, z26, (i2 & 16) != 0 ? c02a.A0W : false);
    }

    public static final C02A A01(1Il r301, C1J8 c1j8, 1JB r303, 1Ii r304, Integer num, Integer num2, Integer num3, String str, Function1 function1, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26) {
        11T.A0F(r304, 8);
        11T.A0F(r301, 10);
        11T.A0F(num2, 21);
        11T.A0F(num3, 32);
        return new C02A(r301, c1j8, r303, r304, num, num2, num3, str, function1, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C02A)) {
                return false;
            }
            C02A c02a = (C02A) obj;
            if (this.A0C != c02a.A0C || this.A0Q != c02a.A0Q || this.A0U != c02a.A0U || this.A0V != c02a.A0V || this.A0Z != c02a.A0Z || !11T.A0O(this.A02, c02a.A02) || this.A0A != c02a.A0A || this.A0N != c02a.A0N || !11T.A0O(this.A04, c02a.A04) || this.A0Y != c02a.A0Y || !11T.A0O(this.A01, c02a.A01) || !11T.A0O(this.A03, c02a.A03) || !11T.A0O(this.A08, c02a.A08) || this.A06 != c02a.A06 || this.A00 != c02a.A00 || this.A0K != c02a.A0K || this.A0D != c02a.A0D || this.A0B != c02a.A0B || this.A0M != c02a.A0M || this.A0T != c02a.A0T || this.A07 != c02a.A07 || this.A0F != c02a.A0F || this.A0H != c02a.A0H || !11T.A0O(this.A09, c02a.A09) || this.A0X != c02a.A0X || this.A0P != c02a.A0P || this.A0J != c02a.A0J || this.A0G != c02a.A0G || this.A0I != c02a.A0I || this.A0S != c02a.A0S || this.A05 != c02a.A05 || this.A0O != c02a.A0O || this.A0L != c02a.A0L || this.A0E != c02a.A0E || this.A0W != c02a.A0W) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        String str;
        int i = 0;
        int A05 = (AnonymousClass002.A05(this.A01, (AnonymousClass002.A05(this.A04, ((((((((((((((AnonymousClass002.A00(this.A0C ? 1 : 0) * 31) + AnonymousClass002.A00(this.A0Q ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0U ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0V ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0Z ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0N ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0Y ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A03)) * 31;
        String str2 = this.A08;
        int hashCode2 = (A05 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.A06;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            hashCode = (1 != intValue ? "LOG" : "CRASH").hashCode() + intValue;
        }
        int A00 = (((((((((((((hashCode2 + hashCode) * 31 * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0K ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0D ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0B ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0M ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0T ? 1 : 0)) * 31;
        int intValue2 = this.A07.intValue();
        int hashCode3 = (((((A00 + (1 != intValue2 ? "SPLIT_BINDERS" : "DEFAULT").hashCode() + intValue2) * 31) + AnonymousClass002.A00(this.A0F ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0H ? 1 : 0)) * 31 * 31;
        Function1 function1 = this.A09;
        if (function1 != null) {
            i = function1.hashCode();
        }
        int A002 = (((((((((((((hashCode3 + i) * 31) + AnonymousClass002.A00(this.A0X ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0P ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0J ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0G ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0I ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0S ? 1 : 0)) * 31;
        int intValue3 = this.A05.intValue();
        switch (intValue3) {
            case 1:
                str = "LAYOUT_SPECS";
                break;
            case 2:
                str = "SPECS";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return ((((((((A002 + str.hashCode() + intValue3) * 31) + AnonymousClass002.A00(this.A0O ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0L ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0E ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0W ? 1 : 0);
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ComponentsConfiguration(disableNestedTreeCaching=");
        A0k.append(this.A0C);
        A0k.append(", shouldAddHostViewForRootComponent=");
        A0k.append(this.A0Q);
        A0k.append(", useIncrementalMountGapWorker=");
        A0k.append(this.A0U);
        A0k.append(", useNonRebindingEventHandlers=");
        A0k.append(this.A0V);
        A0k.append(", shouldDisableBgFgOutputs=");
        A0k.append(this.A0Z);
        A0k.append(", preAllocationHandler=");
        A0k.append(this.A02);
        A0k.append(", avoidRedundantPreAllocations=");
        A0k.append(this.A0A);
        A0k.append(", incrementalMountEnabled=");
        A0k.append(this.A0N);
        A0k.append(", componentHostPoolingPolicy=");
        A0k.append(this.A04);
        A0k.append(", visibilityProcessingEnabled=");
        A0k.append(this.A0Y);
        A0k.append(", errorEventHandler=");
        A0k.append(this.A01);
        A0k.append(", componentsLogger=");
        A0k.append(this.A03);
        A0k.append(", logTag=");
        A0k.append(this.A08);
        A0k.append(", componentHostInvalidModificationPolicy=");
        Integer num = this.A06;
        A0k.append(num != null ? 1 - num.intValue() != 0 ? "LOG" : "CRASH" : "null");
        A0k.append(", debugEventListener=");
        A0k.append((Object) null);
        A0k.append(", enablePreAllocationSameThreadCheck=");
        A0k.append(this.A00);
        A0k.append(", enableSetLifecycleOwnerTreePropViaDefaultLifecycleOwner=");
        A0k.append(this.A0K);
        A0k.append(", enableDefaultLifecycleOwnerAsFragmentOrActivity=");
        A0k.append(this.A0D);
        A0k.append(", cloneStateListAnimators=");
        A0k.append(this.A0B);
        A0k.append(", enableVisibilityFixForNestedLithoView=");
        A0k.append(this.A0M);
        A0k.append(", useDefaultItemAnimatorInLazyCollections=");
        A0k.append(this.A0T);
        A0k.append(", primitiveRecyclerBinderStrategy=");
        A0k.append(1 - this.A07.intValue() != 0 ? "SPLIT_BINDERS" : "DEFAULT");
        A0k.append(", enableFixForIM=");
        A0k.append(this.A0F);
        A0k.append(", enableLifecycleOwnerWrapper=");
        A0k.append(this.A0H);
        A0k.append(", visibilityBoundsTransformer=");
        A0k.append((Object) null);
        A0k.append(", sectionsRecyclerViewOnCreateHandler=");
        A0k.append(this.A09);
        A0k.append(", useStableIdsInRecyclerBinder=");
        A0k.append(this.A0X);
        A0k.append(", performExactSameSpecsCheck=");
        A0k.append(this.A0P);
        A0k.append(", enableResolveWithoutSizeSpec=");
        A0k.append(this.A0J);
        A0k.append(", enableHostWillNotDraw=");
        A0k.append(this.A0G);
        A0k.append(", enableLoggingForRenderInFlight=");
        A0k.append(this.A0I);
        A0k.append(", useComponentTreePropContainerAsSourceOfTruth=");
        A0k.append(this.A0S);
        A0k.append(", componentEqualityMode=");
        switch (this.A05.intValue()) {
            case 1:
                str = "LAYOUT_SPECS";
                break;
            case 2:
                str = "SPECS";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        A0k.append(str);
        A0k.append(", isHostViewAttributesCleanUpEnabled=");
        A0k.append(this.A0O);
        A0k.append(", enableSingleRunnableToReleaseTree=");
        A0k.append(this.A0L);
        A0k.append(", enableFixForCachedNestedTree=");
        A0k.append(this.A0E);
        A0k.append(", usePrimitiveVerticalScroll=");
        A0k.append(this.A0W);
        return AnonymousClass001.A0g(A0k, ')');
    }
}
