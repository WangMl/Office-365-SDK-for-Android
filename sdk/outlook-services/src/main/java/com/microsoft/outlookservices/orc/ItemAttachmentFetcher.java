/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.outlookservices.orc;

import com.microsoft.outlookservices.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.*;
import com.microsoft.services.orc.Readable;
import com.microsoft.services.orc.interfaces.*;

/**
 * The type  ItemAttachmentFetcher.
 */
public class ItemAttachmentFetcher extends OrcEntityFetcher<ItemAttachment,ItemAttachmentOperations> 
                                     implements Readable<ItemAttachment> {

     /**
     * Instantiates a new ItemAttachmentFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public ItemAttachmentFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, ItemAttachment.class, ItemAttachmentOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ItemAttachmentFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ItemAttachmentFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

             /**
     * Gets item.
     *
     * @return the item
     */
    public ItemFetcher getItem() {
        return new ItemFetcher("Item", this);
    }

}
