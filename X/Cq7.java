package X;

import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;

/* loaded from: Cq7.class */
public final class Cq7 implements DIW, DIB {
    public final BhE A00;
    public final ImmutableList A01;
    public final String A02;

    public Cq7(BhE bhE, ImmutableList immutableList) {
        this.A00 = bhE;
        this.A01 = immutableList;
        StringBuilder sb = new StringBuilder("SynchronousDataSourceResultAccumulator(");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= immutableList.size()) {
                this.A02 = 4YV.A0x(sb);
                return;
            }
            sb.append(((DIB) immutableList.get(i2)).getFriendlyName());
            if (i2 != immutableList.size() - 1) {
                sb.append(',');
            }
            i = i2 + 1;
        }
    }

    public void A5L(DFe dFe) {
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    public ImmutableList B7q(ByH byH, Object obj) {
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = this.A01.iterator();
        while (it.hasNext()) {
            DIB dib = (DIB) it.next();
            try {
                BhE bhE = this.A00;
                if (bhE != null && obj != null) {
                    DataSourceIdentifier AgX = dib.AgX();
                    String str = (String) obj;
                    AcP acP = bhE.A00;
                    if (acP != null && AgX != null) {
                        AeG aeG = acP.A0G;
                        if (AeF.A01(aeG)) {
                            AeH aeH = aeG.A08;
                            synchronized (aeH) {
                                try {
                                    aeH.D15(AgX, (ByH) null, str);
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                    break;
                                }
                            }
                        }
                    }
                }
                builder.addAll(dib.B7q(byH, obj));
                if (bhE != null && obj != null) {
                    DataSourceIdentifier AgX2 = dib.AgX();
                    String str2 = (String) obj;
                    AcP acP2 = bhE.A00;
                    if (acP2 != null && AgX2 != null) {
                        AeG aeG2 = acP2.A0G;
                        if (AeF.A01(aeG2)) {
                            AeH aeH2 = aeG2.A08;
                            synchronized (aeH2) {
                                try {
                                    java.util.Map map = aeH2.A04;
                                    String str3 = str2;
                                    if (str2 == null) {
                                        str3 = "";
                                    }
                                    Long l = (Long) map.remove(0Pz.A0j(str3, ":", AgX2.Aus()));
                                    long A08 = 1BL.A08(aeH2.A01);
                                    if (l != null) {
                                        long longValue = l.longValue();
                                        if (A08 >= longValue) {
                                            aeH2.A02.A00(A08 - longValue < AeH.A05 ? BOx.A04 : BOx.A03, AgX2, aeH2.A03, aeH2.A00, str2, null, 0, longValue, A08, false);
                                            AeH.A00(aeH2);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                0fH.A14("SynchronousDataSourceResultAccumulator", "Failure on fetching data from %s: %s", new Object[]{dib.getFriendlyName(), e});
            }
        }
        return builder.build();
    }

    public C1323Ae1 Cpm(ByH byH, Object obj) {
        return AbG.A0n(B7q(byH, obj));
    }

    public String getFriendlyName() {
        return this.A02;
    }
}
