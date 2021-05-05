package com.firsttimeinforever.intellij.pdf.viewer.mpi.model

import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

/**
 * Represents a node in PDF outline.
 * @param name Presentable text of current node
 * @param children Child nodes
 * @param page Page number (is not null only for trees built with PdfBox)
 * @param navigationReference Navigation destination
 */
@Serializable
data class PdfOutlineNode(
  val name: String,
  val children: List<PdfOutlineNode> = emptyList(),
  val page: Int? = null,
  val navigationReference: String = ""
) {
  val isRoot: Boolean
    get() = page == null && name == ROOT_NAME

  companion object {
    fun createRootNode(children: List<PdfOutlineNode> = emptyList(), navigationReference: String = ""): PdfOutlineNode {
      return PdfOutlineNode(ROOT_NAME, children, null, navigationReference)
    }

    @Transient
    private const val ROOT_NAME = "__##root"
  }
}
