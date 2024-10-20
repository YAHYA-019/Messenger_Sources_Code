package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.4Gd, reason: invalid class name */
/* loaded from: 4Gd.class */
public abstract class C4Gd {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C4Gv A00() {
        return new C4Gv(C0s8.A14(new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new C4Gf() { // from class: X.4Gn
            public final C4Gp A00 = new C4Gp();

            @Override // X.C4Gf
            public C4Gy A8f(C4Gc c4Gc, 44I r303) {
                44N r0;
                C43g c43g;
                C4Hu c4Hu;
                11T.A0F(r303, 0);
                11T.A0F(c4Gc, 1);
                C01i c01i = r303.A02;
                44M r02 = (44M) c01i.getValue();
                if (r02 != null && (r0 = (44N) r02.A01.getValue()) != null && (c43g = r0.A00.type.sdkType) != null && c43g != C43g.A05) {
                    44M r03 = (44M) c01i.getValue();
                    if (r03 == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    44N r04 = (44N) r03.A01.getValue();
                    if (r04 == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    try {
                        c4Hu = C4Gp.A00(c4Gc, this.A00, r303, r04);
                    } catch (C4Go | IllegalArgumentException | NullPointerException unused) {
                        c4Hu = new C4Hu(r04, null, false);
                    }
                    if (!c4Hu.A02) {
                        final ImmutableList immutableList = c4Hu.A01;
                        C4H5 c4h5 = new C4H5(immutableList) { // from class: X.4Hv
                            public final ImmutableList A00;

                            {
                                this.A00 = immutableList;
                            }

                            @Override // X.C4H5
                            public ImmutableMap ACn() {
                                ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
                                ImmutableList immutableList2 = this.A00;
                                if (immutableList2 != null && !immutableList2.isEmpty()) {
                                    StringBuilder sb = new StringBuilder();
                                    1Du it = immutableList2.iterator();
                                    while (it.hasNext()) {
                                        44O r05 = (44O) it.next();
                                        if (sb.length() > 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(r05.A00.type.name());
                                    }
                                    builder.put("filterNames", sb.toString());
                                }
                                ImmutableMap build = builder.build();
                                11T.A0A(build);
                                return build;
                            }
                        };
                        if (immutableList == null || immutableList.isEmpty()) {
                            44N r05 = c4Hu.A00;
                            return r05 != null ? new C4Gy(c4h5, null, null, r05, "Failed filter clause", null, false, false, false) : C4Gx.A02(c4h5, "failed_context_filter");
                        }
                        44O r06 = (44O) immutableList.get(0);
                        11T.A0D(r06);
                        11T.A0F(r06, 1);
                        return new C4Gy(c4h5, null, r06, null, "Failed context filter", null, false, false, false);
                    }
                }
                return C4Gx.A00();
            }

            @Override // X.C4Gf
            public String DAM() {
                return "client_filters";
            }
        }, new Object(), new Object(), new Object(), new Object()));
    }
}
