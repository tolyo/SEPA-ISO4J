/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

/**
 * Class Pain00200103DataModel.The pain.002.001.03 data model.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class Pain00200103DataModel extends biz.c24.io.api.data.DataModel {

    /**
     * Field instance.
     */
    private static volatile Pain00200103DataModel instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected Pain00200103DataModel(boolean init) {
        if (init)
            init();
    }

    /**
     * Gets the singleton instance.
     * 
     * @return The instance.
     */
    public static iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel(false);
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    /**
     */
    private void init() {
        setName("pain.002.001.03");
        setTargetNamespace("urn:iso:std:iso:20022:tech:xsd:pain.002.001.03");
        setElementFormDefault(biz.c24.io.api.data.FormEnum.QUALIFIED);
        setAttributeFormDefault(biz.c24.io.api.data.FormEnum.UNQUALIFIED);
        setIdGeneratorMethodDefault(biz.c24.io.api.data.IDGeneratorMethodEnum.NATIVE);
        setSource(new biz.c24.io.api.presentation.XMLSource());
        setSink(new biz.c24.io.api.presentation.XMLSink());
    }

}
