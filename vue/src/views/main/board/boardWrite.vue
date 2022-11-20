<template>
  <div>
    <div class="page">
      <div class="write-div">
        <div>
          <label>카테고리</label>
        </div>
        <div>
          <category v-model="categoryNo" @update="test"></category>
        </div>
        <div>
          <categoryInfo :value="categoryNo" @select="updateLv2"></categoryInfo>
        </div>
      </div>
      <div class="write-div">
        <div><label>제목</label></div>
        <div class="width-100">
          <input
            class="width-100 height-100"
            type="text"
            placeholder="제목을 입력해주세요"
            v-model="boardTitle"
          />
        </div>
      </div>
      <div class="write-div">
        <div><label class="content-div-label">내용</label></div>
        <div class="width-100">
          <smartEditor v-model="textContent"></smartEditor>
        </div>
      </div>
      <div class="write-div">
        <div>
          <label>이미지</label>
        </div>
        <div>
          <input type="file" />
        </div>
      </div>
      <div class="wirte-div-bottom">
        <div><button class="gray-btn" @click="back">취소</button></div>
        <div><button class="gray-btn" @click="save">저장</button></div>
      </div>
    </div>
  </div>
</template>

<script>
import category from '../../../components/board/CMP_CATEGORY_001.vue'
import categoryInfo from '../../../components/board/CMP_CATEGORY_002.vue'
import axios from 'axios'

export default {
  data() {
    return {
      textContent: '',
      boardTitle: '',
      categoryNo: '0',
      categoryDetailNo: '0',
    }
  },
  components: {
    category,
    categoryInfo,
  },
  computed: {
    z() {
      return {
        test: true,
        asd: true,
      }
    },
  },
  methods: {
    save() {
      console.log(this.boardTitle)
      console.log(this.textContent)
      console.log(this.categoryDetailNo)
      this.param = {
        boardTitle: this.boardTitle,
        textContent: this.textContent,
        categoryDetailNo: this.categoryDetailNo,
      }
      axios
        .post('/api/v1/board/insertBoard', {
          boardTitle: this.boardTitle,
          textContent: this.textContent,
          categoryDetailNo: this.categoryDetailNo,
        })
        .then((res) => {
          console.log(res)
        })
    },
    test(e) {
      this.categoryNo = e
      this.categoryDetailNo = '0'
    },
    back() {
      this.$router.go(-1)
    },
    updateLv2(e) {
      this.categoryDetailNo = e
    },
  },
}
</script>

<style></style>
