package com.fasterxml.jackson.databind.ext;

import X.0Q8;
import X.7kF;
import X.AbstractC01033pi;
import X.C27T;
import X.C42h;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;

/* loaded from: NioPathDeserializer.class */
public class NioPathDeserializer extends StdScalarDeserializer {
    public static final boolean A00;
    public static final long serialVersionUID = 1;

    static {
        File[] listRoots = File.listRoots();
        int length = listRoots.length;
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            String path = listRoots[i2].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z = true;
                break;
            }
            i = i2 + 1;
        }
        A00 = z;
    }

    public NioPathDeserializer() {
        super(Path.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Path A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        if (!abstractC01033pi.A1u(C42h.A0C)) {
            c27t.A0Y(abstractC01033pi, Path.class);
            throw 0Q8.createAndThrow();
        }
        String A1Z = abstractC01033pi.A1Z();
        if (A1Z.indexOf(58) < 0 || (A00 && A1Z.length() >= 2 && Character.isLetter(A1Z.charAt(0)) && A1Z.charAt(1) == ':')) {
            return Paths.get(A1Z, new String[0]);
        }
        try {
            URI uri = new URI(A1Z);
            try {
                return Paths.get(uri);
            } catch (FileSystemNotFoundException e) {
                try {
                    String scheme = uri.getScheme();
                    Iterator it = ServiceLoader.load(FileSystemProvider.class).iterator();
                    while (it.hasNext()) {
                        FileSystemProvider fileSystemProvider = (FileSystemProvider) it.next();
                        if (fileSystemProvider.getScheme().equalsIgnoreCase(scheme)) {
                            return fileSystemProvider.getPath(uri);
                        }
                    }
                    c27t.A0m(A0S(), e);
                    throw 0Q8.createAndThrow();
                } catch (Throwable th) {
                    th = th;
                    7kF.A00(th, e);
                    c27t.A0m(A0S(), th);
                    throw 0Q8.createAndThrow();
                }
            }
        } catch (URISyntaxException e2) {
            th = e2;
        }
    }
}
