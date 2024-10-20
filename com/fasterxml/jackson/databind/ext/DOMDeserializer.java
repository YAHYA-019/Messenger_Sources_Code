package com.fasterxml.jackson.databind.ext;

import X.0Pz;
import X.C27T;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* loaded from: DOMDeserializer.class */
public abstract class DOMDeserializer extends FromStringDeserializer {
    public static final DocumentBuilderFactory A00;
    public static final long serialVersionUID = 1;

    /* loaded from: DOMDeserializer$DocumentDeserializer.class */
    public class DocumentDeserializer extends DOMDeserializer {
        public static final long serialVersionUID = 1;

        public DocumentDeserializer() {
            super(Document.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public /* bridge */ /* synthetic */ Object A14(C27T c27t, String str) {
            return A16(str);
        }
    }

    /* loaded from: DOMDeserializer$NodeDeserializer.class */
    public class NodeDeserializer extends DOMDeserializer {
        public static final long serialVersionUID = 1;

        public NodeDeserializer() {
            super(Node.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public /* bridge */ /* synthetic */ Object A14(C27T c27t, String str) {
            return A16(str);
        }
    }

    static {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setExpandEntityReferences(false);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Error | ParserConfigurationException unused) {
        }
        try {
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Throwable unused2) {
        }
        try {
            newInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        } catch (Throwable unused3) {
        }
        A00 = newInstance;
    }

    public final Document A16(String str) {
        try {
            return A00.newDocumentBuilder().parse(new InputSource(new StringReader(str)));
        } catch (Exception e) {
            throw new IllegalArgumentException(0Pz.A1B("Failed to parse JSON String as XML: ", e), e);
        }
    }
}
