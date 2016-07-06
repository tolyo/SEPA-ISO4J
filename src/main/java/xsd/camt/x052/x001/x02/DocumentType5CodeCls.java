/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

/**
 * Class DocumentType5CodeCls.The DocumentType5Code atomic simple
 * data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class DocumentType5CodeCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile DocumentType5CodeCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected DocumentType5CodeCls() {
    }

    /**
     * Gets the singleton instance of this type.
     * 
     * @return The type, or its supertype if present.
     */
    public static biz.c24.io.api.data.DataType getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DocumentType5CodeCls();
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    /**
     * Called internally to initialize this type.
     */
    protected void init() {
        setName("DocumentType5Code");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance());
        addValidator(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DocumentType5CodeCls.DocumentType5Code1Enum.getInstance());
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class DocumentType5Code1Enum.The DocumentType5Code
     * enumeration.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class DocumentType5Code1Enum extends biz.c24.io.api.data.DefaultEnumeration {

        /**
         * Field instance.
         */
        private static biz.c24.io.api.data.Enumeration instance;

        private DocumentType5Code1Enum() {
            setName("DocumentType5Code");
            addEntry("MSIN", "", null);
            addEntry("CNFA", "", null);
            addEntry("DNFA", "", null);
            addEntry("CINV", "", null);
            addEntry("CREN", "", null);
            addEntry("DEBN", "", null);
            addEntry("HIRI", "", null);
            addEntry("SBIN", "", null);
            addEntry("CMCN", "", null);
            addEntry("SOAC", "", null);
            addEntry("DISP", "", null);
            addEntry("BOLD", "", null);
            addEntry("VCHR", "", null);
            addEntry("AROI", "", null);
            addEntry("TSUT", "", null);
        }

        /**
         */
        public static biz.c24.io.api.data.Enumeration getInstance() {
            if (instance == null)
                instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DocumentType5CodeCls.DocumentType5Code1Enum();

            return instance;
        }

    }

}
