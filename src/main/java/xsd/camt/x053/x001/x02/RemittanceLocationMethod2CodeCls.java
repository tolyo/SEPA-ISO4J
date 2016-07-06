/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

/**
 * Class RemittanceLocationMethod2CodeCls.The
 * RemittanceLocationMethod2Code atomic simple data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class RemittanceLocationMethod2CodeCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile RemittanceLocationMethod2CodeCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected RemittanceLocationMethod2CodeCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceLocationMethod2CodeCls();
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
        setName("RemittanceLocationMethod2Code");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance());
        addValidator(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceLocationMethod2CodeCls.RemittanceLocationMethod2Code1Enum.getInstance());
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class RemittanceLocationMethod2Code1Enum.The
     * RemittanceLocationMethod2Code enumeration.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class RemittanceLocationMethod2Code1Enum extends biz.c24.io.api.data.DefaultEnumeration {

        /**
         * Field instance.
         */
        private static biz.c24.io.api.data.Enumeration instance;

        private RemittanceLocationMethod2Code1Enum() {
            setName("RemittanceLocationMethod2Code");
            addEntry("FAXI", "", null);
            addEntry("EDIC", "", null);
            addEntry("URID", "", null);
            addEntry("EMAL", "", null);
            addEntry("POST", "", null);
            addEntry("SMSM", "", null);
        }

        /**
         */
        public static biz.c24.io.api.data.Enumeration getInstance() {
            if (instance == null)
                instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceLocationMethod2CodeCls.RemittanceLocationMethod2Code1Enum();

            return instance;
        }

    }

}
