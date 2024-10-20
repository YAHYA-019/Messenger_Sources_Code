package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: Fxk.class */
public final class Fxk implements GHD {
    public final Fxj A00;

    public Fxk(GHD ghd) {
        this.A00 = new Fxj(ghd);
    }

    public static float A00(DKc dKc, int i) {
        Object A01 = dKc.A01(i);
        11T.A0I(A01, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) A01).floatValue();
    }

    public static float A01(DKc dKc, int i) {
        Object A01 = dKc.A01(i);
        11T.A0I(A01, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) A01).floatValue();
    }

    public static int A02(DKc dKc, int i) {
        Object A01 = dKc.A01(i);
        11T.A0I(A01, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) A01).intValue();
    }

    public static PathInterpolator A03(DLQ dlq) {
        return dlq == null ? new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f) : new PathInterpolator(dlq.Amm(35, 0.0f), dlq.Amm(38, 0.0f), dlq.Amm(36, 1.0f), dlq.Amm(40, 1.0f));
    }

    public static FFN A04(GL7 gl7, FHh fHh, DKc dKc, int i) {
        return (FFN) FJ6.A06(gl7, A05(fHh, dKc, i));
    }

    public static FyG A05(FHh fHh, DKc dKc, int i) {
        List list = dKc.A00;
        if (i < list.size()) {
            Object obj = list.get(i);
            if (obj instanceof FyG) {
                return (FyG) obj;
            }
        }
        return fHh.A03;
    }

    /* JADX WARN: Type inference failed for: r0v71, types: [X.FxG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [X.FxG, java.lang.Object] */
    public static FHf A06(FHh fHh, DLQ dlq, Exo exo, String str, List list, List list2, List list3, List list4, List list5, List list6, List list7, java.util.Map map, java.util.Map map2, boolean z, boolean z2) {
        List list8 = list5;
        List list9 = list6;
        Exo exo2 = exo;
        List list10 = list4;
        DLQ dlq2 = dlq;
        ArrayList A0s = AnonymousClass001.A0s();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                Object obj = FAw.A00(fHh).A07.get(A0i);
                if (obj == null) {
                    throw 0Pz.A05(0Pz.A0j("Data Manifest for referenced internal variable id ", A0i, " not found! "), "\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about.");
                }
                A0s.add(obj);
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String A0i2 = AnonymousClass001.A0i(it2);
                java.util.Map singletonMap = Collections.singletonMap("initial", FAw.A02(fHh, A0i2));
                ?? obj2 = new Object();
                ((FxG) obj2).A00 = A0i2;
                ((FxG) obj2).A01 = "ls";
                ((FxG) obj2).A02 = singletonMap;
                A0s.add(obj2);
            }
        }
        if (map != null) {
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                List list11 = fHh.A0D;
                String A00 = FEy.A00(0S2.A00, AnonymousClass001.A0j(A0z), list11, list11.size());
                java.util.Map singletonMap2 = Collections.singletonMap("initial", A0z.getValue());
                ?? obj3 = new Object();
                ((FxG) obj3).A00 = A00;
                ((FxG) obj3).A01 = "ls";
                ((FxG) obj3).A02 = singletonMap2;
                A0s.add(obj3);
            }
        }
        HashMap A0u = AnonymousClass001.A0u();
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                String A0i3 = AnonymousClass001.A0i(it3);
                A0u.put(A0i3, A0B(fHh, A0i3));
            }
        }
        if (z && dlq2 != null) {
            dlq2 = F2V.A00((GJy) null, new EI2(dlq2, z2 ? fHh.A0D : null), dlq2);
        }
        if (list5 == null) {
            list8 = Collections.EMPTY_LIST;
        }
        if (list6 == null) {
            list9 = Collections.EMPTY_LIST;
        }
        if (exo == null) {
            exo2 = EYm.A00(Collections.EMPTY_MAP);
        }
        if (list4 == null) {
            list10 = Collections.EMPTY_LIST;
        }
        return new FHf((EYR) null, dlq2, exo2, str, A0s, list8, list9, list10, list7, A0u, map2);
    }

    public static FHf A07(FHh fHh, Eqz eqz, java.util.Map map, boolean z, boolean z2) {
        DLQ dlq = eqz.A00;
        List list = eqz.A0D;
        List list2 = eqz.A0C;
        List list3 = eqz.A0B;
        Exo exo = eqz.A02;
        List list4 = eqz.A0A;
        List list5 = eqz.A06;
        List list6 = eqz.A09;
        EkC ekC = eqz.A01;
        return A06(fHh, dlq, exo, ekC != null ? ekC.A00 : null, list, list2, list3, list4, list5, list6, eqz.A0E, map, eqz.A0F, z, z2);
    }

    public static FxZ A08(FHh fHh, DKc dKc) {
        return FJ6.A02(A05(fHh, dKc, 3));
    }

    public static DLQ A09(FyG fyG, String str) {
        DLQ A00;
        FxZ A02 = FJ6.A02(fyG);
        DLQ A08 = A02.A08();
        if (A08 != null && (A00 = Fxc.A00(A08, str)) != null) {
            return A00;
        }
        DLQ A002 = Fxc.A00(A02.A09(), str);
        FGT.A02("BloksModelFinder", String.format("Found node %s in unbound tree but not in bound tree %s", str, A02.A08()));
        return A002;
    }

    public static DLQ A0A(DKc dKc) {
        Object obj = dKc.A00.get(0);
        11T.A0I(obj, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        return (DLQ) obj;
    }

    public static EkB A0B(FHh fHh, String str) {
        EkB ekB = (EkB) FAw.A00(fHh).A04.get(str);
        if (ekB != null) {
            return ekB;
        }
        throw 0Pz.A05(0Pz.A0j("Payload for referenced embedded payload id ", str, " not found!"), "\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about.");
    }

    public static final Float A0C(Object obj, int i) {
        String str = (String) obj;
        if (str == null) {
            return null;
        }
        try {
            F7g A08 = FIy.A08(str);
            float f = A08.A00;
            int intValue = A08.A01.intValue();
            if (intValue == 0) {
                return Float.valueOf(f);
            }
            if (intValue == 1) {
                return Float.valueOf((f * i) / 100.0f);
            }
            return null;
        } catch (EKT unused) {
            FGT.A02("AvatarexpressionsTransformAvatarExpressionsInteractiveContainerChild", 0Pz.A0W("Error parsing size : ", str));
            return null;
        }
    }

    public static Integer A0D(String str) {
        if (str.equals("LOCATION_FOREGROUND")) {
            return 0S2.A00;
        }
        if (str.equals("LOCATION_BACKGROUND")) {
            return 0S2.A01;
        }
        if (str.equals("PHOTO_STORAGE")) {
            return 0S2.A0C;
        }
        if (str.equals("CAMERA")) {
            return 0S2.A0N;
        }
        if (str.equals("CONTACT")) {
            return 0S2.A0Y;
        }
        if (str.equals("MICROPHONE")) {
            return 0S2.A0j;
        }
        if (str.equals("ADS_TRACKING")) {
            return 0S2.A0u;
        }
        if (str.equals("CALENDAR")) {
            return 0S2.A15;
        }
        if (str.equals("NOTIFICATION")) {
            return 0S2.A1G;
        }
        if (str.equals("LOCAL_NETWORK")) {
            return 0S2.A1J;
        }
        throw AnonymousClass001.A0L(str);
    }

    public static Integer A0E(String str) {
        if (str.equals("LOCATION_PRECISE")) {
            return 0S2.A00;
        }
        if (str.equals("LOCATION_IMPRECISE")) {
            return 0S2.A01;
        }
        if (str.equals("PHOTO_READ")) {
            return 0S2.A0C;
        }
        if (str.equals("PHOTO_WRITE")) {
            return 0S2.A0N;
        }
        if (str.equals("PHOTO_READ_WRITE")) {
            return 0S2.A0Y;
        }
        if (str.equals("STORAGE_READ")) {
            return 0S2.A0j;
        }
        if (str.equals("STORAGE_WRITE")) {
            return 0S2.A0u;
        }
        if (str.equals("STORAGE_READ_WRITE")) {
            return 0S2.A15;
        }
        if (str.equals("CONTACTS_READ_WRITE")) {
            return 0S2.A1G;
        }
        if (str.equals("UNSPECIFIED")) {
            return 0S2.A1J;
        }
        throw AnonymousClass001.A0L(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r301 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A0F(X.DKc r301, int r302) {
        /*
            r0 = r301
            r1 = r302
            java.lang.Object r0 = r0.A01(r1)
            r303 = r0
            r0 = r303
            boolean r0 = r0 instanceof java.lang.Number
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L18
            r0 = r303
            java.lang.String r0 = r0.toString()
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L1f
        L18:
            r0 = r303
            r301 = r0
            r0 = r303
            java.lang.String r0 = (java.lang.String) r0
            r301 = r0
        L1f:
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fxk.A0F(X.DKc, int):java.lang.String");
    }

    public static final String A0G(Object obj) {
        ArrayList A0z;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            A0z = AnonymousClass001.A0t(map.size());
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z2 = AnonymousClass001.A0z(A0y);
                A0z.add(0Pz.A0Y(A0G(A0z2.getKey()), A0G(A0z2.getValue()), '='));
            }
            charSequence = "{ ";
            charSequence2 = " }";
        } else {
            if (!(obj instanceof List)) {
                if (!(obj instanceof String)) {
                    return String.valueOf(obj);
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append('\"');
                A0k.append(obj);
                return AnonymousClass001.A0g(A0k, '\"');
            }
            Iterable iterable = (Iterable) obj;
            A0z = 1BL.A0z(iterable);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                A0z.add(A0G(it.next()));
            }
            charSequence = "[ ";
            charSequence2 = " ]";
        }
        return 0QD.A0K(", ", charSequence, charSequence2, A0z, (Function1) null, -1);
    }

    public static ArrayList A0H(FxZ fxZ, List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FHf fHf = (FHf) it.next();
            if (!fxZ.A0O) {
                2JB.A02("Tree operations are only supported from the UI Thread");
                fxZ.A0H.add(fHf);
                FxZ.A03(fxZ);
            }
            A0s.add(fHf.A02);
        }
        return A0s;
    }

    public static List A0I(DKc dKc) {
        Object obj = dKc.A00.get(1);
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>");
        return (List) obj;
    }

    public static List A0J(DKc dKc) {
        Object obj = dKc.A00.get(1);
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>");
        return (List) obj;
    }

    public static void A0K(Animator animator, Object obj, Object obj2, Object obj3) {
        11T.A0F(animator, 0);
        animator.addListener(new 8BP(0, obj, obj2, obj3));
    }

    public static final void A0L(FyG fyG, List list) {
        if (1BK.A1X(FyG.A02(fyG, 2131362427), true)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DKC.A07(it).setDuration(0L);
            }
        }
    }

    public static void A0M(FxZ fxZ, Object obj, String str, int i) {
        fxZ.A0E(new Fxc(str), new EIZ(obj, i));
    }

    public static final boolean A0N() {
        return ValueAnimator.areAnimatorsEnabled();
    }

    public static Object[] A0O() {
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v1496 ??, still in use, count: 7, list:
          (r312v1496 ??) from 0xf84e: PHI (r312v1912 ??) = 
          (r312v4 ??)
          (r312v11 ??)
          (r312v12 ??)
          (r312v14 ??)
          (r312v16 ??)
          (r312v20 ??)
          (r312v25 ??)
          (r312v28 ??)
          (r312v30 ??)
          (r312v30 ??)
          (r312v30 ??)
          (r312v30 ??)
          (r312v31 ??)
          (r312v34 ??)
          (r312v36 ??)
          (r312v36 ??)
          (r312v36 ??)
          (r312v39 ??)
          (r312v40 ??)
          (r312v43 ??)
          (r312v45 ??)
          (r312v52 ??)
          (r312v55 ??)
          (r312v63 ??)
          (r312v67 ??)
          (r312v78 ??)
          (r312v80 ??)
          (r312v86 ??)
          (r312v89 ??)
          (r312v94 ??)
          (r312v96 ??)
          (r312v98 ??)
          (r312v105 ??)
          (r312v128 ??)
          (r312v134 ??)
          (r312v138 ??)
          (r312v142 ??)
          (r312v153 ??)
          (r312v158 ??)
          (r312v165 ??)
          (r312v168 ??)
          (r312v174 ??)
          (r312v178 ??)
          (r312v190 ??)
          (r312v192 ??)
          (r312v205 ??)
          (r312v208 ??)
          (r312v216 ??)
          (r312v216 ??)
          (r312v220 ??)
          (r312v221 ??)
          (r312v225 ??)
          (r312v229 ??)
          (r312v234 ??)
          (r312v245 ??)
          (r312v249 ??)
          (r312v252 ??)
          (r312v255 ??)
          (r312v259 ??)
          (r312v270 ??)
          (r312v277 ??)
          (r312v277 ??)
          (r312v279 ??)
          (r312v283 ??)
          (r312v286 ??)
          (r312v293 ??)
          (r312v298 ??)
          (r312v301 ??)
          (r312v304 ??)
          (r312v307 ??)
          (r312v314 ??)
          (r312v316 ??)
          (r312v320 ??)
          (r312v328 ??)
          (r312v333 ??)
          (r312v334 ??)
          (r312v336 ??)
          (r312v360 ??)
          (r312v374 ??)
          (r312v378 ??)
          (r312v403 ??)
          (r312v412 ??)
          (r312v413 ??)
          (r312v416 ??)
          (r312v420 ??)
          (r312v419 ??)
          (r312v426 ??)
          (r312v427 ??)
          (r312v431 ??)
          (r312v433 ??)
          (r312v433 ??)
          (r312v436 ??)
          (r312v439 ??)
          (r312v443 ??)
          (r312v469 ??)
          (r312v471 ??)
          (r312v474 ??)
          (r312v481 ??)
          (r312v489 ??)
          (r312v490 ??)
          (r312v494 ??)
          (r312v497 ??)
          (r312v503 ??)
          (r312v505 ??)
          (r312v505 ??)
          (r312v505 ??)
          (r312v508 ??)
          (r312v508 ??)
          (r312v510 ??)
          (r312v513 ??)
          (r312v515 ??)
          (r312v521 ??)
          (r312v521 ??)
          (r312v523 ??)
          (r312v526 ??)
          (r312v532 ??)
          (r312v536 ??)
          (r312v574 ??)
          (r312v580 ??)
          (r312v584 ??)
          (r312v584 ??)
          (r312v591 ??)
          (r312v592 ??)
          (r312v597 ??)
          (r312v603 ??)
          (r312v606 ??)
          (r312v609 ??)
          (r312v610 ??)
          (r312v615 ??)
          (r312v618 ??)
          (r312v627 ??)
          (r312v631 ??)
          (r312v634 ??)
          (r312v637 ??)
          (r312v639 ??)
          (r312v645 ??)
          (r312v657 ??)
          (r312v661 ??)
          (r312v664 ??)
          (r312v667 ??)
          (r312v670 ??)
          (r312v672 ??)
          (r312v670 ??)
          (r312v680 ??)
          (r312v684 ??)
          (r312v701 ??)
          (r312v706 ??)
          (r312v714 ??)
          (r312v718 ??)
          (r312v720 ??)
          (r312v728 ??)
          (r312v732 ??)
          (r312v742 ??)
          (r312v744 ??)
          (r312v749 ??)
          (r312v750 ??)
          (r312v752 ??)
          (r312v755 ??)
          (r312v758 ??)
          (r312v763 ??)
          (r312v767 ??)
          (r312v769 ??)
          (r312v770 ??)
          (r312v773 ??)
          (r312v775 ??)
          (r312v775 ??)
          (r312v778 ??)
          (r312v779 ??)
          (r312v782 ??)
          (r312v789 ??)
          (r312v793 ??)
          (r312v802 ??)
          (r312v810 ??)
          (r312v813 ??)
          (r312v815 ??)
          (r312v818 ??)
          (r312v820 ??)
          (r312v832 ??)
          (r312v835 ??)
          (r312v848 ??)
          (r312v858 ??)
          (r312v860 ??)
          (r312v860 ??)
          (r312v860 ??)
          (r312v860 ??)
          (r312v872 ??)
          (r312v881 ??)
          (r312v886 ??)
          (r312v888 ??)
          (r312v888 ??)
          (r312v888 ??)
          (r312v888 ??)
          (r312v888 ??)
          (r312v888 ??)
          (r312v896 ??)
          (r312v901 ??)
          (r312v907 ??)
          (r312v911 ??)
          (r312v917 ??)
          (r312v927 ??)
          (r312v932 ??)
          (r312v935 ??)
          (r312v940 ??)
          (r312v945 ??)
          (r312v952 ??)
          (r312v955 ??)
          (r312v967 ??)
          (r312v970 ??)
          (r312v975 ??)
          (r312v975 ??)
          (r312v983 ??)
          (r312v986 ??)
          (r312v998 ??)
          (r312v1002 ??)
          (r312v1008 ??)
          (r312v1009 ??)
          (r312v1013 ??)
          (r312v1016 ??)
          (r312v1019 ??)
          (r312v1027 ??)
          (r312v1030 ??)
          (r312v1035 ??)
          (r312v1043 ??)
          (r312v1048 ??)
          (r312v1073 ??)
          (r312v1075 ??)
          (r312v1078 ??)
          (r312v1093 ??)
          (r312v1105 ??)
          (r312v1112 ??)
          (r312v1122 ??)
          (r312v1124 ??)
          (r312v1128 ??)
          (r312v1131 ??)
          (r312v1134 ??)
          (r312v1141 ??)
          (r312v1144 ??)
          (r312v1154 ??)
          (r312v1163 ??)
          (r312v1166 ??)
          (r312v1177 ??)
          (r312v1181 ??)
          (r312v1191 ??)
          (r312v1208 ??)
          (r312v1211 ??)
          (r312v1214 ??)
          (r312v1217 ??)
          (r312v1220 ??)
          (r312v1220 ??)
          (r312v1221 ??)
          (r312v1226 ??)
          (r312v1230 ??)
          (r312v1231 ??)
          (r312v1231 ??)
          (r312v1231 ??)
          (r312v1231 ??)
          (r312v1231 ??)
          (r312v1231 ??)
          (r312v1237 ??)
          (r312v1242 ??)
          (r312v1247 ??)
          (r312v1253 ??)
          (r312v1256 ??)
          (r312v1260 ??)
          (r312v1266 ??)
          (r312v1277 ??)
          (r312v1281 ??)
          (r312v1300 ??)
          (r312v1304 ??)
          (r312v1305 ??)
          (r312v1307 ??)
          (r312v1315 ??)
          (r312v1320 ??)
          (r312v1325 ??)
          (r312v1342 ??)
          (r312v1351 ??)
          (r312v1359 ??)
          (r312v1372 ??)
          (r312v1389 ??)
          (r312v1393 ??)
          (r312v1396 ??)
          (r312v1405 ??)
          (r312v1428 ??)
          (r312v1431 ??)
          (r312v1434 ??)
          (r312v1435 ??)
          (r312v1443 ??)
          (r312v1449 ??)
          (r312v1461 ??)
          (r312v1464 ??)
          (r312v1467 ??)
          (r312v1476 ??)
          (r312v1481 ??)
          (r312v1487 ??)
          (r312v1492 ??)
          (r312v1496 ??)
          (r312v1503 ??)
          (r312v1506 ??)
          (r312v1508 ??)
          (r312v1512 ??)
          (r312v1516 ??)
          (r312v1523 ??)
          (r312v1538 ??)
          (r312v1540 ??)
          (r312v1547 ??)
          (r312v1555 ??)
          (r312v1557 ??)
          (r312v1557 ??)
          (r312v1560 ??)
          (r312v1568 ??)
          (r312v1576 ??)
          (r312v1578 ??)
          (r312v1579 ??)
          (r312v1585 ??)
          (r312v1595 ??)
          (r312v1599 ??)
          (r312v1599 ??)
          (r312v1611 ??)
          (r312v1636 ??)
          (r312v1648 ??)
          (r312v1661 ??)
          (r312v1667 ??)
          (r312v1669 ??)
          (r312v1704 ??)
          (r312v1713 ??)
          (r312v1719 ??)
          (r312v1721 ??)
          (r312v1734 ??)
          (r312v1753 ??)
          (r312v1756 ??)
          (r312v1761 ??)
          (r312v1765 ??)
          (r312v1773 ??)
          (r312v1780 ??)
          (r312v1800 ??)
          (r312v1804 ??)
          (r312v1810 ??)
          (r312v1824 ??)
          (r312v1828 ??)
          (r312v1832 ??)
          (r312v1835 ??)
          (r312v1839 ??)
          (r312v1849 ??)
          (r312v1861 ??)
          (r312v1862 ??)
          (r312v1868 ??)
          (r312v1872 ??)
          (r312v1873 ??)
          (r312v1875 ??)
          (r312v1878 ??)
          (r312v1878 ??)
          (r312v1878 ??)
          (r312v1883 ??)
          (r312v1890 ??)
          (r312v1894 ??)
          (r312v1898 ??)
          (r312v1900 ??)
          (r312v1903 ??)
          (r312v1914 ??)
         binds: [B:10679:0xf83b, B:10663:0xf7fd, B:10633:0xf71c, B:10629:0xf845, B:10611:0xf6b0, B:10605:0xf694, B:10584:0xf61c, B:10568:0xf5ce, B:10532:0xf535, B:10541:0xf556, B:10544:0xf562, B:10548:0xf577, B:10549:0xf57a, B:10524:0xf509, B:10497:0xf46e, B:10500:0xf47a, B:10503:0xf486, B:10511:0xf4c5, B:10494:0xf45b, B:10484:0xf425, B:10476:0xf3fb, B:10447:0xf358, B:10432:0xf2ff, B:10375:0xf1ce, B:10357:0xf16f, B:10323:0xf0cc, B:10301:0xf055, B:10273:0xefd9, B:10267:0xefb3, B:10241:0xef34, B:10231:0xeeec, B:10217:0xeec3, B:10184:0xedfc, B:9933:0xed92, B:9911:0xe865, B:9880:0xe7a4, B:9866:0xe755, B:9835:0xe706, B:9816:0xe636, B:9778:0xe573, B:9755:0xe503, B:9702:0xe3de, B:9674:0xe33a, B:9644:0xe2a9, B:9633:0xe26b, B:9549:0xe07f, B:9535:0xe030, B:9490:0xdf8c, B:9492:0xdf95, B:9457:0xde96, B:9456:0xde8e, B:9448:0xde66, B:9423:0xddf2, B:9410:0xddb1, B:9365:0xdc87, B:9349:0xdc23, B:9328:0xdb9c, B:9326:0xdbc9, B:9298:0xdb22, B:9234:0xd9c7, B:9186:0xd8bc, B:9192:0xd8d1, B:9199:0xd902, B:9178:0xd88f, B:9165:0xd842, B:9125:0xd761, B:9101:0xd6d6, B:9095:0xd6b4, B:9082:0xd665, B:9068:0xd61d, B:9054:0xd5dc, B:9034:0xd569, B:9026:0xd53e, B:8982:0xe86a, B:8988:0xd47d, B:8986:0xd46d, B:8980:0xd460, B:8876:0xd248, B:8693:0xce91, B:8665:0xce13, B:8541:0xcb47, B:8474:0xc9d4, B:8466:0xc9ae, B:8458:0xc97b, B:8444:0xc92b, B:8443:0xc928, B:8428:0xc8e7, B:8427:0xc8e4, B:8407:0xc890, B:8369:0xc7d0, B:8378:0xc7f1, B:8380:0xc7fb, B:8361:0xc7a4, B:8335:0xc721, B:8244:0xc52f, B:8243:0xc525, B:8227:0xc4d0, B:8197:0xc456, B:8193:0xc43d, B:8143:0xc2e6, B:8135:0xc2bb, B:8126:0xc287, B:8095:0xc1e7, B:8071:0xc16d, B:8074:0xc17b, B:8082:0xc1a7, B:8052:0xc10a, B:8054:0xc113, B:8006:0xc008, B:7999:0xbfe3, B:7986:0xbf9f, B:7938:0xbeb6, B:7944:0xbecb, B:7951:0xbefc, B:7930:0xbe8c, B:7912:0xbe36, B:7897:0xbde5, B:7726:0xba67, B:7707:0xba02, B:7666:0xb94d, B:7668:0xb956, B:7613:0xb814, B:7607:0xb7e9, B:7582:0xb77e, B:7554:0xb707, B:7531:0xb69b, B:7530:0xb691, B:7526:0xb671, B:7509:0xb61b, B:7490:0xb5bf, B:7455:0xb4fc, B:7432:0xb48f, B:7417:0xb436, B:7394:0xb3c4, B:7384:0xb393, B:7362:0xb311, B:7325:0xb289, B:7242:0xb05c, B:7237:0xb03f, B:7225:0xaffe, B:7194:0xaf61, B:7199:0xaf7d, B:7192:0xf84e, B:7162:0xaead, B:7119:0xae0a, B:7061:0xaca4, B:7028:0xac0c, B:7004:0xab9c, B:6970:0xab06, B:6944:0xaa60, B:6927:0xaa17, B:6900:0xa994, B:6860:0xa8d0, B:6840:0xa870, B:6825:0xa7fa, B:6810:0xa782, B:6800:0xa753, B:6799:0xa749, B:6782:0xa6ff, B:6775:0xa6da, B:6743:0xa628, B:6710:0xa56a, B:6717:0xa59e, B:6681:0xa4cc, B:6641:0xa3ff, B:6656:0xa43a, B:6654:0xa45c, B:6653:0xa459, B:6629:0xa3b2, B:6609:0xa366, B:6607:0xa350, B:6554:0xa2d7, B:6518:0xa16a, B:6491:0xa0ce, B:6485:0xa0ac, B:6477:0xa080, B:6465:0xa03a, B:6423:0x9f70, B:6390:0x9e8e, B:6337:0x9e29, B:6276:0x9c43, B:6164:0x998a, B:6162:0x997a, B:6271:0x9c3b, B:6122:0x988e, B:6070:0x980b, B:6041:0x96b4, B:5991:0x95a1, B:5889:0x9334, B:5892:0x9340, B:5896:0x9357, B:5989:0x9554, B:5934:0x9598, B:5886:0x9323, B:5859:0x9297, B:5825:0x91cc, B:5796:0x9152, B:5772:0x90d0, B:5766:0x90ac, B:5725:0x8fea, B:5677:0x8f4d, B:5643:0x8e3d, B:5618:0x8dc6, B:5589:0x8d4b, B:5532:0x8c11, B:5506:0x8b94, B:5456:0x8aac, B:5427:0x89df, B:5412:0x8994, B:5414:0x899d, B:5362:0x8868, B:5349:0x882b, B:5314:0x8796, B:5281:0x86ec, B:5269:0x86b8, B:5268:0x86b5, B:5251:0x8662, B:5207:0x863a, B:5174:0x84b2, B:5129:0x83b0, B:5123:0x838e, B:5097:0x8344, B:4973:0x7f84, B:4950:0x7f1d, B:4835:0x7cc6, B:4822:0x7c7f, B:4817:0x7c61, B:4780:0x7b88, B:4749:0x7b03, B:4739:0x7aad, B:4680:0x7944, B:4662:0x7b1b, B:4631:0x783b, B:4608:0x77cb, B:4588:0x7752, B:4576:0x7707, B:4563:0x76b6, B:4526:0x75eb, B:4514:0x75ae, B:4486:0x7518, B:4429:0x73e7, B:4406:0x736e, B:4314:0x71b2, B:4263:0x702c, B:4240:0x6f98, B:4217:0x6f20, B:4203:0x6ed0, B:4178:0x6e41, B:4184:0x6e5b, B:4189:0x6e80, B:4169:0x6e04, B:3943:0x68b0, B:3948:0x68cd, B:3951:0x68de, B:3997:0x6a71, B:3999:0x6a7d, B:4041:0x6bbb, B:4096:0x6d66, B:3913:0x6820, B:3863:0x6702, B:3838:0x669c, B:3790:0x658a, B:3764:0x64f1, B:3747:0x649a, B:3728:0x6435, B:3685:0x6310, B:3659:0x6284, B:3524:0x5fce, B:3511:0x5f81, B:3517:0x5fa5, B:3495:0x5f23, B:3437:0x5e64, B:3402:0x5d27, B:3389:0x5ce0, B:3345:0x5c31, B:3186:0x58de, B:3094:0x5882, B:3012:0x55ba, B:2978:0x5406, B:2952:0x5377, B:2937:0x531f, B:2916:0x52d2, B:2886:0x5223, B:2843:0x511a, B:2820:0x5090, B:2813:0x5063, B:2781:0x4fb4, B:2759:0x4f43, B:2747:0x4efa, B:2745:0x4ee9, B:2685:0x4da8, B:2645:0x4cd7, B:2629:0x4c8b, B:2607:0xf84e, B:2578:0x4b7d, B:2538:0x4abe, B:2487:0x49a1, B:2473:0x4956, B:2459:0x490b, B:2458:0x4901, B:2438:0x489c, B:2411:0x4845, B:2351:0x46e5, B:2325:0x463d, B:2258:0x4527, B:2224:0x43ee, B:2172:0x42e5, B:2183:0x4313, B:2190:0x4333, B:2160:0x4282, B:2125:0x41cd, B:2095:0xf84e, B:2077:0x40dc, B:2052:0x4092, B:2005:0x3faf, B:1980:0x3f37, B:1902:0x3d97, B:1879:0x3d19, B:1770:0x3b0d, B:1714:0x3959, B:1666:0x387b, B:1645:0x3811, B:1613:0x3707, B:1376:0x31bf, B:1334:0x3135, B:1309:0x306c, B:1297:0x301e, B:1221:0x2e77, B:1144:0x2cbf, B:1122:0x2c45, B:1110:0x2bf3, B:1090:0x2b89, B:1073:0x2b3d, B:1039:0x2a7e, B:978:0x2a23, B:906:0x27ce, B:887:0x27c0, B:849:0x2646, B:839:0x260e, B:825:0x25bc, B:818:0x258a, B:752:0xd32e, B:688:0x23ef, B:639:0x21f3, B:636:0x21dc, B:615:0x216d, B:594:0x2100, B:568:0xf624, B:576:0xf84e, B:514:0x1f4b, B:531:0x1fb4, B:533:0x1fbe, B:470:0x1e1b, B:440:0x1dc1, B:424:0x1d13, B:401:0x1c99, B:384:0x1c3e, B:379:0x1c18, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
          (r312v1496 ?? I:java.lang.Object) from 0x4a54: INVOKE (r0v9735 ?? I:X.DKc) = (r0v9733 ?? I:X.DKM), (r312v1496 ?? I:java.lang.Object), (r2v446 ?? I:int) STATIC call: X.DKM.A07(X.DKM, java.lang.Object, int):X.DKc A[Catch: all -> 0xf859]
          (r312v1496 ?? I:android.animation.ValueAnimator) from 0x4a6d: INVOKE (r312v1496 ?? I:android.animation.ValueAnimator), (r0v9736 ?? I:android.animation.ValueAnimator$AnimatorUpdateListener) VIRTUAL call: android.animation.ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener):void A[Catch: all -> 0xf859, MD:(android.animation.ValueAnimator$AnimatorUpdateListener):void (c)]
          (r312v1496 ?? I:android.animation.Animator) from 0x4a84: INVOKE (r312v1496 ?? I:android.animation.Animator), (r0v9739 ?? I:android.animation.Animator$AnimatorListener) VIRTUAL call: android.animation.Animator.addListener(android.animation.Animator$AnimatorListener):void A[Catch: all -> 0xf859, MD:(android.animation.Animator$AnimatorListener):void (c)]
          (r312v1496 ?? I:android.animation.Animator) from 0x4a89: INVOKE (r312v1496 ?? I:android.animation.Animator) STATIC call: X.DKD.A17(android.animation.Animator):void A[Catch: all -> 0xf859]
          (r312v1496 ?? I:android.animation.ValueAnimator) from 0x4aa3: INVOKE (r312v1496 ?? I:android.animation.ValueAnimator), (r0v9744 ?? I:float[]) VIRTUAL call: android.animation.ValueAnimator.setFloatValues(float[]):void A[Catch: all -> 0xf859, MD:(float[]):void VARARG (c)]
          (r312v1496 ?? I:android.animation.ValueAnimator) from 0x4ac0: INVOKE (r312v1496 ?? I:android.animation.ValueAnimator), (r0v9753 ?? I:long) VIRTUAL call: android.animation.ValueAnimator.setDuration(long):android.animation.ValueAnimator A[Catch: all -> 0xf859, MD:(long):android.animation.ValueAnimator (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public /* bridge */ /* synthetic */ java.lang.Object AQy(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v1496 ??, still in use, count: 7, list:
          (r312v1496 ??) from 0xf84e: PHI (r312v1912 ??) = 
          (r312v4 ??)
          (r312v11 ??)
          (r312v12 ??)
          (r312v14 ??)
          (r312v16 ??)
          (r312v20 ??)
          (r312v25 ??)
          (r312v28 ??)
          (r312v30 ??)
          (r312v30 ??)
          (r312v30 ??)
          (r312v30 ??)
          (r312v31 ??)
          (r312v34 ??)
          (r312v36 ??)
          (r312v36 ??)
          (r312v36 ??)
          (r312v39 ??)
          (r312v40 ??)
          (r312v43 ??)
          (r312v45 ??)
          (r312v52 ??)
          (r312v55 ??)
          (r312v63 ??)
          (r312v67 ??)
          (r312v78 ??)
          (r312v80 ??)
          (r312v86 ??)
          (r312v89 ??)
          (r312v94 ??)
          (r312v96 ??)
          (r312v98 ??)
          (r312v105 ??)
          (r312v128 ??)
          (r312v134 ??)
          (r312v138 ??)
          (r312v142 ??)
          (r312v153 ??)
          (r312v158 ??)
          (r312v165 ??)
          (r312v168 ??)
          (r312v174 ??)
          (r312v178 ??)
          (r312v190 ??)
          (r312v192 ??)
          (r312v205 ??)
          (r312v208 ??)
          (r312v216 ??)
          (r312v216 ??)
          (r312v220 ??)
          (r312v221 ??)
          (r312v225 ??)
          (r312v229 ??)
          (r312v234 ??)
          (r312v245 ??)
          (r312v249 ??)
          (r312v252 ??)
          (r312v255 ??)
          (r312v259 ??)
          (r312v270 ??)
          (r312v277 ??)
          (r312v277 ??)
          (r312v279 ??)
          (r312v283 ??)
          (r312v286 ??)
          (r312v293 ??)
          (r312v298 ??)
          (r312v301 ??)
          (r312v304 ??)
          (r312v307 ??)
          (r312v314 ??)
          (r312v316 ??)
          (r312v320 ??)
          (r312v328 ??)
          (r312v333 ??)
          (r312v334 ??)
          (r312v336 ??)
          (r312v360 ??)
          (r312v374 ??)
          (r312v378 ??)
          (r312v403 ??)
          (r312v412 ??)
          (r312v413 ??)
          (r312v416 ??)
          (r312v420 ??)
          (r312v419 ??)
          (r312v426 ??)
          (r312v427 ??)
          (r312v431 ??)
          (r312v433 ??)
          (r312v433 ??)
          (r312v436 ??)
          (r312v439 ??)
          (r312v443 ??)
          (r312v469 ??)
          (r312v471 ??)
          (r312v474 ??)
          (r312v481 ??)
          (r312v489 ??)
          (r312v490 ??)
          (r312v494 ??)
          (r312v497 ??)
          (r312v503 ??)
          (r312v505 ??)
          (r312v505 ??)
          (r312v505 ??)
          (r312v508 ??)
          (r312v508 ??)
          (r312v510 ??)
          (r312v513 ??)
          (r312v515 ??)
          (r312v521 ??)
          (r312v521 ??)
          (r312v523 ??)
          (r312v526 ??)
          (r312v532 ??)
          (r312v536 ??)
          (r312v574 ??)
          (r312v580 ??)
          (r312v584 ??)
          (r312v584 ??)
          (r312v591 ??)
          (r312v592 ??)
          (r312v597 ??)
          (r312v603 ??)
          (r312v606 ??)
          (r312v609 ??)
          (r312v610 ??)
          (r312v615 ??)
          (r312v618 ??)
          (r312v627 ??)
          (r312v631 ??)
          (r312v634 ??)
          (r312v637 ??)
          (r312v639 ??)
          (r312v645 ??)
          (r312v657 ??)
          (r312v661 ??)
          (r312v664 ??)
          (r312v667 ??)
          (r312v670 ??)
          (r312v672 ??)
          (r312v670 ??)
          (r312v680 ??)
          (r312v684 ??)
          (r312v701 ??)
          (r312v706 ??)
          (r312v714 ??)
          (r312v718 ??)
          (r312v720 ??)
          (r312v728 ??)
          (r312v732 ??)
          (r312v742 ??)
          (r312v744 ??)
          (r312v749 ??)
          (r312v750 ??)
          (r312v752 ??)
          (r312v755 ??)
          (r312v758 ??)
          (r312v763 ??)
          (r312v767 ??)
          (r312v769 ??)
          (r312v770 ??)
          (r312v773 ??)
          (r312v775 ??)
          (r312v775 ??)
          (r312v778 ??)
          (r312v779 ??)
          (r312v782 ??)
          (r312v789 ??)
          (r312v793 ??)
          (r312v802 ??)
          (r312v810 ??)
          (r312v813 ??)
          (r312v815 ??)
          (r312v818 ??)
          (r312v820 ??)
          (r312v832 ??)
          (r312v835 ??)
          (r312v848 ??)
          (r312v858 ??)
          (r312v860 ??)
          (r312v860 ??)
          (r312v860 ??)
          (r312v860 ??)
          (r312v872 ??)
          (r312v881 ??)
          (r312v886 ??)
          (r312v888 ??)
          (r312v888 ??)
          (r312v888 ??)
          (r312v888 ??)
          (r312v888 ??)
          (r312v888 ??)
          (r312v896 ??)
          (r312v901 ??)
          (r312v907 ??)
          (r312v911 ??)
          (r312v917 ??)
          (r312v927 ??)
          (r312v932 ??)
          (r312v935 ??)
          (r312v940 ??)
          (r312v945 ??)
          (r312v952 ??)
          (r312v955 ??)
          (r312v967 ??)
          (r312v970 ??)
          (r312v975 ??)
          (r312v975 ??)
          (r312v983 ??)
          (r312v986 ??)
          (r312v998 ??)
          (r312v1002 ??)
          (r312v1008 ??)
          (r312v1009 ??)
          (r312v1013 ??)
          (r312v1016 ??)
          (r312v1019 ??)
          (r312v1027 ??)
          (r312v1030 ??)
          (r312v1035 ??)
          (r312v1043 ??)
          (r312v1048 ??)
          (r312v1073 ??)
          (r312v1075 ??)
          (r312v1078 ??)
          (r312v1093 ??)
          (r312v1105 ??)
          (r312v1112 ??)
          (r312v1122 ??)
          (r312v1124 ??)
          (r312v1128 ??)
          (r312v1131 ??)
          (r312v1134 ??)
          (r312v1141 ??)
          (r312v1144 ??)
          (r312v1154 ??)
          (r312v1163 ??)
          (r312v1166 ??)
          (r312v1177 ??)
          (r312v1181 ??)
          (r312v1191 ??)
          (r312v1208 ??)
          (r312v1211 ??)
          (r312v1214 ??)
          (r312v1217 ??)
          (r312v1220 ??)
          (r312v1220 ??)
          (r312v1221 ??)
          (r312v1226 ??)
          (r312v1230 ??)
          (r312v1231 ??)
          (r312v1231 ??)
          (r312v1231 ??)
          (r312v1231 ??)
          (r312v1231 ??)
          (r312v1231 ??)
          (r312v1237 ??)
          (r312v1242 ??)
          (r312v1247 ??)
          (r312v1253 ??)
          (r312v1256 ??)
          (r312v1260 ??)
          (r312v1266 ??)
          (r312v1277 ??)
          (r312v1281 ??)
          (r312v1300 ??)
          (r312v1304 ??)
          (r312v1305 ??)
          (r312v1307 ??)
          (r312v1315 ??)
          (r312v1320 ??)
          (r312v1325 ??)
          (r312v1342 ??)
          (r312v1351 ??)
          (r312v1359 ??)
          (r312v1372 ??)
          (r312v1389 ??)
          (r312v1393 ??)
          (r312v1396 ??)
          (r312v1405 ??)
          (r312v1428 ??)
          (r312v1431 ??)
          (r312v1434 ??)
          (r312v1435 ??)
          (r312v1443 ??)
          (r312v1449 ??)
          (r312v1461 ??)
          (r312v1464 ??)
          (r312v1467 ??)
          (r312v1476 ??)
          (r312v1481 ??)
          (r312v1487 ??)
          (r312v1492 ??)
          (r312v1496 ??)
          (r312v1503 ??)
          (r312v1506 ??)
          (r312v1508 ??)
          (r312v1512 ??)
          (r312v1516 ??)
          (r312v1523 ??)
          (r312v1538 ??)
          (r312v1540 ??)
          (r312v1547 ??)
          (r312v1555 ??)
          (r312v1557 ??)
          (r312v1557 ??)
          (r312v1560 ??)
          (r312v1568 ??)
          (r312v1576 ??)
          (r312v1578 ??)
          (r312v1579 ??)
          (r312v1585 ??)
          (r312v1595 ??)
          (r312v1599 ??)
          (r312v1599 ??)
          (r312v1611 ??)
          (r312v1636 ??)
          (r312v1648 ??)
          (r312v1661 ??)
          (r312v1667 ??)
          (r312v1669 ??)
          (r312v1704 ??)
          (r312v1713 ??)
          (r312v1719 ??)
          (r312v1721 ??)
          (r312v1734 ??)
          (r312v1753 ??)
          (r312v1756 ??)
          (r312v1761 ??)
          (r312v1765 ??)
          (r312v1773 ??)
          (r312v1780 ??)
          (r312v1800 ??)
          (r312v1804 ??)
          (r312v1810 ??)
          (r312v1824 ??)
          (r312v1828 ??)
          (r312v1832 ??)
          (r312v1835 ??)
          (r312v1839 ??)
          (r312v1849 ??)
          (r312v1861 ??)
          (r312v1862 ??)
          (r312v1868 ??)
          (r312v1872 ??)
          (r312v1873 ??)
          (r312v1875 ??)
          (r312v1878 ??)
          (r312v1878 ??)
          (r312v1878 ??)
          (r312v1883 ??)
          (r312v1890 ??)
          (r312v1894 ??)
          (r312v1898 ??)
          (r312v1900 ??)
          (r312v1903 ??)
          (r312v1914 ??)
         binds: [B:10679:0xf83b, B:10663:0xf7fd, B:10633:0xf71c, B:10629:0xf845, B:10611:0xf6b0, B:10605:0xf694, B:10584:0xf61c, B:10568:0xf5ce, B:10532:0xf535, B:10541:0xf556, B:10544:0xf562, B:10548:0xf577, B:10549:0xf57a, B:10524:0xf509, B:10497:0xf46e, B:10500:0xf47a, B:10503:0xf486, B:10511:0xf4c5, B:10494:0xf45b, B:10484:0xf425, B:10476:0xf3fb, B:10447:0xf358, B:10432:0xf2ff, B:10375:0xf1ce, B:10357:0xf16f, B:10323:0xf0cc, B:10301:0xf055, B:10273:0xefd9, B:10267:0xefb3, B:10241:0xef34, B:10231:0xeeec, B:10217:0xeec3, B:10184:0xedfc, B:9933:0xed92, B:9911:0xe865, B:9880:0xe7a4, B:9866:0xe755, B:9835:0xe706, B:9816:0xe636, B:9778:0xe573, B:9755:0xe503, B:9702:0xe3de, B:9674:0xe33a, B:9644:0xe2a9, B:9633:0xe26b, B:9549:0xe07f, B:9535:0xe030, B:9490:0xdf8c, B:9492:0xdf95, B:9457:0xde96, B:9456:0xde8e, B:9448:0xde66, B:9423:0xddf2, B:9410:0xddb1, B:9365:0xdc87, B:9349:0xdc23, B:9328:0xdb9c, B:9326:0xdbc9, B:9298:0xdb22, B:9234:0xd9c7, B:9186:0xd8bc, B:9192:0xd8d1, B:9199:0xd902, B:9178:0xd88f, B:9165:0xd842, B:9125:0xd761, B:9101:0xd6d6, B:9095:0xd6b4, B:9082:0xd665, B:9068:0xd61d, B:9054:0xd5dc, B:9034:0xd569, B:9026:0xd53e, B:8982:0xe86a, B:8988:0xd47d, B:8986:0xd46d, B:8980:0xd460, B:8876:0xd248, B:8693:0xce91, B:8665:0xce13, B:8541:0xcb47, B:8474:0xc9d4, B:8466:0xc9ae, B:8458:0xc97b, B:8444:0xc92b, B:8443:0xc928, B:8428:0xc8e7, B:8427:0xc8e4, B:8407:0xc890, B:8369:0xc7d0, B:8378:0xc7f1, B:8380:0xc7fb, B:8361:0xc7a4, B:8335:0xc721, B:8244:0xc52f, B:8243:0xc525, B:8227:0xc4d0, B:8197:0xc456, B:8193:0xc43d, B:8143:0xc2e6, B:8135:0xc2bb, B:8126:0xc287, B:8095:0xc1e7, B:8071:0xc16d, B:8074:0xc17b, B:8082:0xc1a7, B:8052:0xc10a, B:8054:0xc113, B:8006:0xc008, B:7999:0xbfe3, B:7986:0xbf9f, B:7938:0xbeb6, B:7944:0xbecb, B:7951:0xbefc, B:7930:0xbe8c, B:7912:0xbe36, B:7897:0xbde5, B:7726:0xba67, B:7707:0xba02, B:7666:0xb94d, B:7668:0xb956, B:7613:0xb814, B:7607:0xb7e9, B:7582:0xb77e, B:7554:0xb707, B:7531:0xb69b, B:7530:0xb691, B:7526:0xb671, B:7509:0xb61b, B:7490:0xb5bf, B:7455:0xb4fc, B:7432:0xb48f, B:7417:0xb436, B:7394:0xb3c4, B:7384:0xb393, B:7362:0xb311, B:7325:0xb289, B:7242:0xb05c, B:7237:0xb03f, B:7225:0xaffe, B:7194:0xaf61, B:7199:0xaf7d, B:7192:0xf84e, B:7162:0xaead, B:7119:0xae0a, B:7061:0xaca4, B:7028:0xac0c, B:7004:0xab9c, B:6970:0xab06, B:6944:0xaa60, B:6927:0xaa17, B:6900:0xa994, B:6860:0xa8d0, B:6840:0xa870, B:6825:0xa7fa, B:6810:0xa782, B:6800:0xa753, B:6799:0xa749, B:6782:0xa6ff, B:6775:0xa6da, B:6743:0xa628, B:6710:0xa56a, B:6717:0xa59e, B:6681:0xa4cc, B:6641:0xa3ff, B:6656:0xa43a, B:6654:0xa45c, B:6653:0xa459, B:6629:0xa3b2, B:6609:0xa366, B:6607:0xa350, B:6554:0xa2d7, B:6518:0xa16a, B:6491:0xa0ce, B:6485:0xa0ac, B:6477:0xa080, B:6465:0xa03a, B:6423:0x9f70, B:6390:0x9e8e, B:6337:0x9e29, B:6276:0x9c43, B:6164:0x998a, B:6162:0x997a, B:6271:0x9c3b, B:6122:0x988e, B:6070:0x980b, B:6041:0x96b4, B:5991:0x95a1, B:5889:0x9334, B:5892:0x9340, B:5896:0x9357, B:5989:0x9554, B:5934:0x9598, B:5886:0x9323, B:5859:0x9297, B:5825:0x91cc, B:5796:0x9152, B:5772:0x90d0, B:5766:0x90ac, B:5725:0x8fea, B:5677:0x8f4d, B:5643:0x8e3d, B:5618:0x8dc6, B:5589:0x8d4b, B:5532:0x8c11, B:5506:0x8b94, B:5456:0x8aac, B:5427:0x89df, B:5412:0x8994, B:5414:0x899d, B:5362:0x8868, B:5349:0x882b, B:5314:0x8796, B:5281:0x86ec, B:5269:0x86b8, B:5268:0x86b5, B:5251:0x8662, B:5207:0x863a, B:5174:0x84b2, B:5129:0x83b0, B:5123:0x838e, B:5097:0x8344, B:4973:0x7f84, B:4950:0x7f1d, B:4835:0x7cc6, B:4822:0x7c7f, B:4817:0x7c61, B:4780:0x7b88, B:4749:0x7b03, B:4739:0x7aad, B:4680:0x7944, B:4662:0x7b1b, B:4631:0x783b, B:4608:0x77cb, B:4588:0x7752, B:4576:0x7707, B:4563:0x76b6, B:4526:0x75eb, B:4514:0x75ae, B:4486:0x7518, B:4429:0x73e7, B:4406:0x736e, B:4314:0x71b2, B:4263:0x702c, B:4240:0x6f98, B:4217:0x6f20, B:4203:0x6ed0, B:4178:0x6e41, B:4184:0x6e5b, B:4189:0x6e80, B:4169:0x6e04, B:3943:0x68b0, B:3948:0x68cd, B:3951:0x68de, B:3997:0x6a71, B:3999:0x6a7d, B:4041:0x6bbb, B:4096:0x6d66, B:3913:0x6820, B:3863:0x6702, B:3838:0x669c, B:3790:0x658a, B:3764:0x64f1, B:3747:0x649a, B:3728:0x6435, B:3685:0x6310, B:3659:0x6284, B:3524:0x5fce, B:3511:0x5f81, B:3517:0x5fa5, B:3495:0x5f23, B:3437:0x5e64, B:3402:0x5d27, B:3389:0x5ce0, B:3345:0x5c31, B:3186:0x58de, B:3094:0x5882, B:3012:0x55ba, B:2978:0x5406, B:2952:0x5377, B:2937:0x531f, B:2916:0x52d2, B:2886:0x5223, B:2843:0x511a, B:2820:0x5090, B:2813:0x5063, B:2781:0x4fb4, B:2759:0x4f43, B:2747:0x4efa, B:2745:0x4ee9, B:2685:0x4da8, B:2645:0x4cd7, B:2629:0x4c8b, B:2607:0xf84e, B:2578:0x4b7d, B:2538:0x4abe, B:2487:0x49a1, B:2473:0x4956, B:2459:0x490b, B:2458:0x4901, B:2438:0x489c, B:2411:0x4845, B:2351:0x46e5, B:2325:0x463d, B:2258:0x4527, B:2224:0x43ee, B:2172:0x42e5, B:2183:0x4313, B:2190:0x4333, B:2160:0x4282, B:2125:0x41cd, B:2095:0xf84e, B:2077:0x40dc, B:2052:0x4092, B:2005:0x3faf, B:1980:0x3f37, B:1902:0x3d97, B:1879:0x3d19, B:1770:0x3b0d, B:1714:0x3959, B:1666:0x387b, B:1645:0x3811, B:1613:0x3707, B:1376:0x31bf, B:1334:0x3135, B:1309:0x306c, B:1297:0x301e, B:1221:0x2e77, B:1144:0x2cbf, B:1122:0x2c45, B:1110:0x2bf3, B:1090:0x2b89, B:1073:0x2b3d, B:1039:0x2a7e, B:978:0x2a23, B:906:0x27ce, B:887:0x27c0, B:849:0x2646, B:839:0x260e, B:825:0x25bc, B:818:0x258a, B:752:0xd32e, B:688:0x23ef, B:639:0x21f3, B:636:0x21dc, B:615:0x216d, B:594:0x2100, B:568:0xf624, B:576:0xf84e, B:514:0x1f4b, B:531:0x1fb4, B:533:0x1fbe, B:470:0x1e1b, B:440:0x1dc1, B:424:0x1d13, B:401:0x1c99, B:384:0x1c3e, B:379:0x1c18, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
          (r312v1496 ?? I:java.lang.Object) from 0x4a54: INVOKE (r0v9735 ?? I:X.DKc) = (r0v9733 ?? I:X.DKM), (r312v1496 ?? I:java.lang.Object), (r2v446 ?? I:int) STATIC call: X.DKM.A07(X.DKM, java.lang.Object, int):X.DKc A[Catch: all -> 0xf859]
          (r312v1496 ?? I:android.animation.ValueAnimator) from 0x4a6d: INVOKE (r312v1496 ?? I:android.animation.ValueAnimator), (r0v9736 ?? I:android.animation.ValueAnimator$AnimatorUpdateListener) VIRTUAL call: android.animation.ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener):void A[Catch: all -> 0xf859, MD:(android.animation.ValueAnimator$AnimatorUpdateListener):void (c)]
          (r312v1496 ?? I:android.animation.Animator) from 0x4a84: INVOKE (r312v1496 ?? I:android.animation.Animator), (r0v9739 ?? I:android.animation.Animator$AnimatorListener) VIRTUAL call: android.animation.Animator.addListener(android.animation.Animator$AnimatorListener):void A[Catch: all -> 0xf859, MD:(android.animation.Animator$AnimatorListener):void (c)]
          (r312v1496 ?? I:android.animation.Animator) from 0x4a89: INVOKE (r312v1496 ?? I:android.animation.Animator) STATIC call: X.DKD.A17(android.animation.Animator):void A[Catch: all -> 0xf859]
          (r312v1496 ?? I:android.animation.ValueAnimator) from 0x4aa3: INVOKE (r312v1496 ?? I:android.animation.ValueAnimator), (r0v9744 ?? I:float[]) VIRTUAL call: android.animation.ValueAnimator.setFloatValues(float[]):void A[Catch: all -> 0xf859, MD:(float[]):void VARARG (c)]
          (r312v1496 ?? I:android.animation.ValueAnimator) from 0x4ac0: INVOKE (r312v1496 ?? I:android.animation.ValueAnimator), (r0v9753 ?? I:long) VIRTUAL call: android.animation.ValueAnimator.setDuration(long):android.animation.ValueAnimator A[Catch: all -> 0xf859, MD:(long):android.animation.ValueAnimator (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */
}
