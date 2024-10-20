package com.fasterxml.jackson.databind.ext;

import X.28Q;
import X.C26c;
import X.C42h;
import X.C4Nr;
import X.Kls;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.nio.file.Path;

/* loaded from: NioPathSerializer.class */
public class NioPathSerializer extends StdScalarSerializer {
    public static final long serialVersionUID = 1;

    public NioPathSerializer() {
        super(Path.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        Path path = (Path) obj;
        Kls A03 = c4Nr.A03(C42h.A0C, path);
        A03.A01 = Path.class;
        Kls A01 = c4Nr.A01(r302, A03);
        r302.A0r(path.toUri().toString());
        c4Nr.A02(r302, A01);
    }
}
