/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

/**
 * Class CopyDuplicate1CodeCls.The CopyDuplicate1Code atomic simple
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
public class CopyDuplicate1CodeCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile CopyDuplicate1CodeCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected CopyDuplicate1CodeCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CopyDuplicate1CodeCls();
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
        setName("CopyDuplicate1Code");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance());
        addValidator(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CopyDuplicate1CodeCls.CopyDuplicate1Code1Enum.getInstance());
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class CopyDuplicate1Code1Enum.The CopyDuplicate1Code
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
    public static class CopyDuplicate1Code1Enum extends biz.c24.io.api.data.DefaultEnumeration {

        /**
         * Field instance.
         */
        private static biz.c24.io.api.data.Enumeration instance;

        private CopyDuplicate1Code1Enum() {
            setName("CopyDuplicate1Code");
            addEntry("CODU", "", null);
            addEntry("COPY", "", null);
            addEntry("DUPL", "", null);
        }

        /**
         */
        public static biz.c24.io.api.data.Enumeration getInstance() {
            if (instance == null)
                instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CopyDuplicate1CodeCls.CopyDuplicate1Code1Enum();

            return instance;
        }

    }

}
