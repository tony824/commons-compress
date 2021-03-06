/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.compress.compressors.z;

import org.junit.Test;

import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;

import static org.mockito.Mockito.mock;
import static org.powermock.api.mockito.PowerMockito.doReturn;


/**
 * Unit tests for class {@link ZCompressorInputStream}.
 *
 * @date 16.06.2017
 * @see ZCompressorInputStream
 **/
public class ZCompressorInputStreamTest {


    @Test(expected = IOException.class)
    public void testFailsToCreateZCompressorInputStreamAndThrowsIOException() throws IOException {

        Enumeration<SequenceInputStream> enumeration = (Enumeration<SequenceInputStream>) mock(Enumeration.class);
        SequenceInputStream sequenceInputStream = new SequenceInputStream(enumeration);
        ZCompressorInputStream zCompressorInputStream = null;

        doReturn(false).when(enumeration).hasMoreElements();

        zCompressorInputStream = new ZCompressorInputStream(sequenceInputStream);

    }


}