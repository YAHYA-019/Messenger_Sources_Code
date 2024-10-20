package X;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* loaded from: A6w.class */
public final class A6w implements InterfaceC07434jv {
    public final 1Br A00 = 1Bu.A00(68701);

    @Override // X.InterfaceC07434jv
    public /* bridge */ /* synthetic */ Object A4o(Object obj, Object obj2) {
        8zS r0;
        C96k c96k;
        Integer num;
        int i;
        9QB r02 = (9QB) obj;
        if (r02 == null || (r0 = r02.A00) == null) {
            C9fa c9fa = (C9fa) 1Br.A0B(this.A00);
            1Br r03 = c9fa.A02;
            if (7zP.A0e(r03).isMarkerOn(814286340)) {
                7zP.A0e(r03).markerAnnotate(814286340, c9fa.A00, "initial_state");
            }
            0fH.A0n("AIBotEmbodimentGraphAdapter", "Initial status is not available!");
            return null;
        }
        int integer = ((1qX) r0).mResultSet.getInteger(0, 0);
        8Lm r04 = new 8Lm(Integer.valueOf(((1qX) r0).mResultSet.getInteger(0, 1)), Integer.valueOf(7zP.A03(r0, 0)), Integer.valueOf(((1qX) r0).mResultSet.getInteger(0, 3)), Integer.valueOf(((1qX) r0).mResultSet.getInteger(0, 4)), 48);
        8zT r05 = r02.A01;
        int A02 = 7zV.A02(r05);
        LinkedHashMap A1C = 1BK.A1C();
        if (A02 == 0) {
            C9fa c9fa2 = (C9fa) 1Br.A0B(this.A00);
            1Br r06 = c9fa2.A02;
            if (7zP.A0e(r06).isMarkerOn(814286340)) {
                7zP.A0e(r06).markerAnnotate(814286340, c9fa2.A00, "state_with_no_transition");
            }
        } else {
            for (int i2 = 0; i2 < A02; i2++) {
                if (r05 != null) {
                    Integer valueOf = Integer.valueOf(((1qX) r05).mResultSet.getInteger(i2, 0));
                    Integer valueOf2 = Integer.valueOf(7zP.A03(r05, i2));
                    Integer valueOf3 = Integer.valueOf(7zP.A02(r05, i2));
                    Integer valueOf4 = Integer.valueOf(((1qX) r05).mResultSet.getInteger(i2, 3));
                    long j = ((1qX) r05).mResultSet.getLong(i2, 4);
                    if (valueOf != null && valueOf2 != null && valueOf3 != null) {
                        AbstractMap abstractMap = (AbstractMap) A1C.get(valueOf);
                        if (abstractMap == null) {
                            abstractMap = 1BK.A1C();
                        }
                        int intValue = valueOf3.intValue();
                        C96k[] values = C96k.values();
                        int length = values.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                c96k = values[i3];
                                if (c96k.value != intValue) {
                                    i3++;
                                }
                            } else {
                                c96k = C96k.A08;
                            }
                        }
                        Object obj3 = abstractMap.get(c96k);
                        if (obj3 == null) {
                            int intValue2 = valueOf2.intValue();
                            Integer[] A00 = 0S2.A00(3);
                            int length2 = A00.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 < length2) {
                                    num = A00[i4];
                                    switch (num.intValue()) {
                                        case 1:
                                            i = 1;
                                            break;
                                        case 2:
                                            i = 2;
                                            break;
                                        default:
                                            i = 0;
                                            break;
                                    }
                                    if (valueOf4 != null) {
                                        if (i == valueOf4.intValue()) {
                                        }
                                    }
                                    i4++;
                                } else {
                                    num = 0S2.A00;
                                }
                            }
                            obj3 = new 8Jh(c96k, num, intValue2, j);
                        }
                        abstractMap.put(c96k, obj3);
                        A1C.put(valueOf, abstractMap);
                    }
                }
            }
        }
        8zU r07 = r02.A02;
        int A022 = 7zV.A02(r07);
        LinkedHashMap A1C2 = 1BK.A1C();
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i5 = 0; i5 < A022; i5++) {
            if (r07 != null) {
                int integer2 = ((1qX) r07).mResultSet.getInteger(i5, 0);
                int A023 = 7zP.A02(r07, i5);
                int A03 = 7zP.A03(r07, i5);
                int integer3 = ((1qX) r07).mResultSet.getInteger(i5, 3);
                boolean z = ((1qX) r07).mResultSet.getBoolean(i5, 4);
                long j2 = ((1qX) r07).mResultSet.getLong(i5, 5);
                String A0m = 7zP.A0m(r07, i5);
                String A0n = 7zP.A0n(r07, i5);
                String A0o = 7zP.A0o(r07, i5);
                long j3 = ((1qX) r07).mResultSet.getLong(i5, 9);
                boolean z2 = ((1qX) r07).mResultSet.getBoolean(i5, 10);
                Integer valueOf5 = Integer.valueOf(integer2);
                8LY r323 = (8LY) A1C2.get(valueOf5);
                if (r323 == null) {
                    LinkedHashMap A1C3 = 1BK.A1C();
                    LinkedHashMap linkedHashMap = (LinkedHashMap) A1C.get(valueOf5);
                    if (linkedHashMap == null) {
                        linkedHashMap = 1BK.A1C();
                    }
                    r323 = new 8LY(A1C3, linkedHashMap, integer2);
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) r323.A01;
                Integer valueOf6 = Integer.valueOf(A023);
                8LY r304 = (8LY) linkedHashMap2.get(valueOf6);
                if (r304 == null) {
                    r304 = new 8LY((DqL) null, 1BK.A1C(), A023);
                }
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) r304.A02;
                Integer valueOf7 = Integer.valueOf(A03);
                DqL dqL = (DqL) linkedHashMap3.get(valueOf7);
                if (dqL == null) {
                    dqL = new DqL(1BK.A1C(), A03);
                }
                LinkedHashMap linkedHashMap4 = (LinkedHashMap) dqL.A01;
                Integer valueOf8 = Integer.valueOf(integer3);
                C2634Gjm c2634Gjm = (C2634Gjm) linkedHashMap4.get(valueOf8);
                if (c2634Gjm == null) {
                    c2634Gjm = new C2634Gjm(AnonymousClass001.A0s(), integer3, 0, 0);
                }
                ArrayList A10 = 7zO.A10((Collection) c2634Gjm.A02, 0);
                String valueOf9 = String.valueOf(j2);
                11T.A0D(A0m);
                11T.A0D(A0n);
                QAN qan = new QAN(valueOf9, A0m, A0n, A0o, j3);
                A10.add(qan);
                if (z2) {
                    A0s.add(qan);
                }
                linkedHashMap4.put(valueOf8, new C2634Gjm(A10, c2634Gjm.A00, c2634Gjm.A01, 0));
                DqL dqL2 = new DqL(linkedHashMap4, dqL.A00);
                linkedHashMap3.put(valueOf7, dqL2);
                linkedHashMap2.put(valueOf6, new 8LY(z ? dqL2 : null, linkedHashMap3, r304.A00));
                int i6 = r323.A00;
                LinkedHashMap linkedHashMap5 = (LinkedHashMap) r323.A02;
                11T.A0F(linkedHashMap5, 2);
                A1C2.put(valueOf5, new 8LY(linkedHashMap2, linkedHashMap5, i6));
            }
        }
        return new 8Ky(r04, Integer.valueOf(integer), A1C2, C0ty.A00, 0QD.A0V(A0s));
    }
}
