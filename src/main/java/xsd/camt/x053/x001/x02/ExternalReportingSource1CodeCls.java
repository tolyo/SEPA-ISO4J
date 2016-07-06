/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

/**
 * Class ExternalReportingSource1CodeCls.The
 * ExternalReportingSource1Code atomic simple data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class ExternalReportingSource1CodeCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile ExternalReportingSource1CodeCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected ExternalReportingSource1CodeCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ExternalReportingSource1CodeCls();
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
        setName("ExternalReportingSource1Code");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance());
        setMinLength(1);
        setMaxLength(4);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
