/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

/**
 * Class DocumentElement.The Document element.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class DocumentElement extends biz.c24.io.api.data.Element {

    /**
     * Field instance.
     */
    private static volatile DocumentElement instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    public DocumentElement() {
        this(true);
    }

    private DocumentElement(boolean init) {
        super("Document", 1, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.DocumentCls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance());

        if (init)
            init();
    }

    /**
     */
    public static biz.c24.io.api.data.Element getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.DocumentElement(false);
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
        setIgnoredElement(false);
    }

}
