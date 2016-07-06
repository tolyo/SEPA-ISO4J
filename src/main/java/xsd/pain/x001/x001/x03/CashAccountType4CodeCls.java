/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

/**
 * Class CashAccountType4CodeCls.The CashAccountType4Code atomic
 * simple data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class CashAccountType4CodeCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile CashAccountType4CodeCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected CashAccountType4CodeCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccountType4CodeCls();
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
        setName("CashAccountType4Code");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance());
        addValidator(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccountType4CodeCls.CashAccountType4Code1Enum.getInstance());
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class CashAccountType4Code1Enum.The CashAccountType4Code
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
    public static class CashAccountType4Code1Enum extends biz.c24.io.api.data.DefaultEnumeration {

        /**
         * Field instance.
         */
        private static biz.c24.io.api.data.Enumeration instance;

        private CashAccountType4Code1Enum() {
            setName("CashAccountType4Code");
            addEntry("CASH", "", null);
            addEntry("CHAR", "", null);
            addEntry("COMM", "", null);
            addEntry("TAXE", "", null);
            addEntry("CISH", "", null);
            addEntry("TRAS", "", null);
            addEntry("SACC", "", null);
            addEntry("CACC", "", null);
            addEntry("SVGS", "", null);
            addEntry("ONDP", "", null);
            addEntry("MGLD", "", null);
            addEntry("NREX", "", null);
            addEntry("MOMA", "", null);
            addEntry("LOAN", "", null);
            addEntry("SLRY", "", null);
            addEntry("ODFT", "", null);
        }

        /**
         */
        public static biz.c24.io.api.data.Enumeration getInstance() {
            if (instance == null)
                instance = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccountType4CodeCls.CashAccountType4Code1Enum();

            return instance;
        }

    }

}
