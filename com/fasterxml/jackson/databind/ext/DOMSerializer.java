package com.fasterxml.jackson.databind.ext;

import X.0Pz;
import X.28Q;
import X.7zO;
import X.C26a;
import X.C26c;
import X.C2cb;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.StringWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;

/* loaded from: DOMSerializer.class */
public class DOMSerializer extends StdSerializer {
    public final TransformerFactory transformerFactory;

    public DOMSerializer() {
        super(Node.class);
        try {
            TransformerFactory newInstance = TransformerFactory.newInstance();
            this.transformerFactory = newInstance;
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Exception e) {
            throw new IllegalStateException(0Pz.A1B("Could not instantiate `TransformerFactory`: ", e), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        Node node = (Node) obj;
        try {
            Transformer newTransformer = this.transformerFactory.newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", "yes");
            newTransformer.setOutputProperty("indent", "no");
            StreamResult streamResult = new StreamResult(new StringWriter());
            newTransformer.transform(new DOMSource(node), streamResult);
            r302.A0r(streamResult.getWriter().toString());
        } catch (TransformerConfigurationException e) {
            throw new IllegalStateException(0Pz.A1B("Could not create XML Transformer for writing DOM `Node` value: ", e), e);
        } catch (TransformerException e2) {
            throw new C2cb(((C26a) c26c).A00, String.format("DOM `Node` value serialization failed: %s", 7zO.A1a(e2)), e2);
        }
    }
}
