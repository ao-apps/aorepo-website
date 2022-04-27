/*
 * aorepo-website - The aorepo.org website.
 * Copyright (C) 2021, 2022  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of aorepo-website.
 *
 * aorepo-website is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * aorepo-website is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with aorepo-website.  If not, see <https://www.gnu.org/licenses/>.
 */
module org.aorepo.website {
  // Direct
  requires org.aorepo.book; // <groupId>org.aorepo</groupId><artifactId>aorepo-book</artifactId>
  requires org.aorepo.parent.book; // <groupId>org.aorepo</groupId><artifactId>aorepo-parent-book</artifactId>
  requires com.semanticcms.core.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId>
  requires com.semanticcms.news.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId>
  requires com.semanticcms.section.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId>
} // TODO: Avoiding rewrite-maven-plugin-4.22.2 truncation
